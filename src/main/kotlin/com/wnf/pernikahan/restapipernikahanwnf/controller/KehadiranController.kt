package com.wnf.pernikahan.restapipernikahanwnf.controller

import com.wnf.pernikahan.restapipernikahanwnf.model.CreateKehadiranRequest
import com.wnf.pernikahan.restapipernikahanwnf.model.KehadiranResponse
import com.wnf.pernikahan.restapipernikahanwnf.model.WebResponse
import com.wnf.pernikahan.restapipernikahanwnf.services.KehadiranService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class KehadiranController(val kehadiranService: KehadiranService) {

    @PostMapping(
        value = ["api/v1/kehadiran"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createKehadiran(@RequestBody body: CreateKehadiranRequest): WebResponse<KehadiranResponse> {
        val kehadiranResponse = kehadiranService.create(body)

        return WebResponse(
            code = 200,
            status = "OK",
            data = kehadiranResponse
        )
    }
}