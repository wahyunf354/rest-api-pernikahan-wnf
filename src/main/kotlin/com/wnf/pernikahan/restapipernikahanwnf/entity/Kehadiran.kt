package com.wnf.pernikahan.restapipernikahanwnf.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "kehadiran")
data class Kehadiran (

    @Id
    val id: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "is_present")
    val isPresent: Boolean,

    @Column(name = "attendance")
    val attendance: Int,

    @Column(name = "id_kehadiran")
    val idPernikahan: String,

    @Column(name = "created_at")
    val createdAt: Date,

    @Column(name = "updated_at")
    val updatedAt: Date?
)