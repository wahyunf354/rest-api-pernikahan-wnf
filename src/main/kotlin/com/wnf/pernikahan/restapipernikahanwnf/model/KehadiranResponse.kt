package com.wnf.pernikahan.restapipernikahanwnf.model

import jakarta.persistence.Column
import jakarta.persistence.Id
import java.util.*

data class KehadiranResponse (
    val id: String,

    val name: String,

    val kehadiran: Boolean,

    val jumlah_kehadiran: Int,

    val id_pernikahan: String,

    val createdAt: Date,

    val updatedAt: Date?
)