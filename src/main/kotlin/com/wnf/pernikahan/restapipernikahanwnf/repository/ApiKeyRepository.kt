package com.wnf.pernikahan.restapipernikahanwnf.repository

import com.wnf.pernikahan.restapipernikahanwnf.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository: JpaRepository<ApiKey, String> {

}