package com.wnf.pernikahan.restapipernikahanwnf.services

import com.wnf.pernikahan.restapipernikahanwnf.model.CreateKehadiranRequest
import com.wnf.pernikahan.restapipernikahanwnf.model.KehadiranResponse

interface KehadiranService {
    fun create(createKehadiranRequest: CreateKehadiranRequest): KehadiranResponse
}