package com.wnf.pernikahan.restapipernikahanwnf.model

import jakarta.validation.constraints.NotBlank

data class CreateWistRequest (

    @field:NotBlank
    val id: String?,

    @field:NotBlank
    val name: String?,

    @field:NotBlank
    val ucapan: String?,

    @field:NotBlank
    val id_pernikahan: String?
)