package com.wnf.pernikahan.restapipernikahanwnf.services

import com.wnf.pernikahan.restapipernikahanwnf.model.CreateWistRequest
import com.wnf.pernikahan.restapipernikahanwnf.model.ListWistRequest
import com.wnf.pernikahan.restapipernikahanwnf.model.WistResponse

interface WistService {
    fun create(createWistRequest: CreateWistRequest): WistResponse

    fun list(listWistRequest: ListWistRequest): List<WistResponse>
}