package com.wnf.pernikahan.restapipernikahanwnf.services.impl

import com.wnf.pernikahan.restapipernikahanwnf.entity.Wist
import com.wnf.pernikahan.restapipernikahanwnf.model.CreateWistRequest
import com.wnf.pernikahan.restapipernikahanwnf.model.ListWistRequest
import com.wnf.pernikahan.restapipernikahanwnf.model.WistResponse
import com.wnf.pernikahan.restapipernikahanwnf.repository.WistRepository
import com.wnf.pernikahan.restapipernikahanwnf.services.WistService
import com.wnf.pernikahan.restapipernikahanwnf.validation.ValidationUtil
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors

@Service
class WistServiceImlp (
    val wistRepository: WistRepository,
    val validationUtil: ValidationUtil
) : WistService {
    override fun create(createWistRequest: CreateWistRequest): WistResponse {
        validationUtil.validate(createWistRequest)

        val wist = Wist(
            id = createWistRequest.id!!,
            name = createWistRequest.name!!,
            ucapan = createWistRequest.ucapan!!,
            idPernikahan = createWistRequest.id_pernikahan!!,
            createdAt = Date(),
            updatedAt = null
        );

        wistRepository.save(wist)

        return WistResponse(
            id = wist.id,
            name = wist.name,
            ucapan = wist.ucapan,
            id_pernikahan = wist.idPernikahan,
            created_at = wist.createdAt,
            updated_at = wist.updatedAt
        )
    }

    override fun list(listWistRequest: ListWistRequest): List<WistResponse> {

        val pageable : Pageable = PageRequest.of(listWistRequest.page, listWistRequest.size)
        val wists = wistRepository.findAllByIdPernikahan(listWistRequest.idPernikahan, pageable)
        return wists.map { convertWistToWistResponse(it) }
    }

    private fun convertWistToWistResponse(wist: Wist): WistResponse {
        return WistResponse(
            id = wist.id,
            name = wist.name,
            ucapan = wist.ucapan,
            id_pernikahan = wist.idPernikahan,
            created_at = wist.createdAt,
            updated_at = wist.updatedAt
        )
    }

}