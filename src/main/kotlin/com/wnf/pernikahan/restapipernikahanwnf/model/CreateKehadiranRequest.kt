package com.wnf.pernikahan.restapipernikahanwnf.model

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class CreateKehadiranRequest(

    @field:NotBlank
    val id : String?,

    @field:NotBlank
    val name : String?,

    @field:NotNull
    val kehadiran: Boolean?,

    @field:NotNull
    @field:Min(value = 0)
    val jumlah_kehadiran: Int?,

    @field:NotBlank
    val id_pernikahan: String?

)
