package com.wnf.pernikahan.restapipernikahanwnf.controller

import com.wnf.pernikahan.restapipernikahanwnf.model.CreateWistRequest
import com.wnf.pernikahan.restapipernikahanwnf.model.ListWistRequest
import com.wnf.pernikahan.restapipernikahanwnf.model.WebResponse
import com.wnf.pernikahan.restapipernikahanwnf.model.WistResponse
import com.wnf.pernikahan.restapipernikahanwnf.services.WistService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WistController(val wistService: WistService) {

    @PostMapping(
        value = ["api/v1/ucapandoa"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createWist(@RequestBody body: CreateWistRequest): WebResponse<WistResponse> {
        val wistResponse = wistService.create(body)

        return WebResponse(
            code = 200,
            status = "OK",
            data = wistResponse
        )
    }

    @GetMapping(
        value = ["api/v1/ucapandoa/pernikahan/{idPernikahan}"],
        produces = ["application/json"]
    )
    fun listWists( @PathVariable(value = "idPernikahan") id: String,
                   @RequestParam(value = "size", defaultValue = "10") size: Int,
                   @RequestParam(value = "page", defaultValue = "0") page: Int): WebResponse<List<WistResponse>> {
        val request = ListWistRequest(page, size, id)
        val response = wistService.list(request)
        return WebResponse(
            code= 200,
            status = "OK",
            data = response
        )
    }

}