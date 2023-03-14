package com.wnf.pernikahan.restapipernikahanwnf.repository

import com.wnf.pernikahan.restapipernikahanwnf.entity.Wist
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface WistRepository : JpaRepository<Wist, String> {

    fun findAllByIdPernikahan(idPernikahan: String, pageable: Pageable) : List<Wist>

}