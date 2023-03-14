package com.wnf.pernikahan.restapipernikahanwnf.services.impl

import com.wnf.pernikahan.restapipernikahanwnf.entity.Kehadiran
import com.wnf.pernikahan.restapipernikahanwnf.model.CreateKehadiranRequest
import com.wnf.pernikahan.restapipernikahanwnf.model.KehadiranResponse
import com.wnf.pernikahan.restapipernikahanwnf.repository.KehadiranRepository
import com.wnf.pernikahan.restapipernikahanwnf.services.KehadiranService
import com.wnf.pernikahan.restapipernikahanwnf.validation.ValidationUtil
import org.springframework.stereotype.Service
import java.util.Date

@Service
class KehadiranServiceImpl (
    val kehadiranRepository: KehadiranRepository,
    val validationUtil: ValidationUtil
) :KehadiranService {
    override fun create(createKehadiranRequest: CreateKehadiranRequest): KehadiranResponse {

        validationUtil.validate(createKehadiranRequest)

        val kehadiran = Kehadiran(
            id = createKehadiranRequest.id!!,
            name = createKehadiranRequest.name!!,
            isPresent = createKehadiranRequest.kehadiran!!,
            attendance = createKehadiranRequest.jumlah_kehadiran!!,
            idPernikahan = createKehadiranRequest.id_pernikahan!!,
            createdAt = Date(),
            updatedAt = null
        );

        kehadiranRepository.save(kehadiran)

        return KehadiranResponse(
            id = kehadiran.id,
            name = kehadiran.name,
            kehadiran = kehadiran.isPresent,
            jumlah_kehadiran = kehadiran.attendance,
            id_pernikahan = kehadiran.idPernikahan,
            createdAt = kehadiran.createdAt,
            updatedAt = kehadiran.updatedAt
        )

    }
}