package com.wnf.pernikahan.restapipernikahanwnf.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.Date

@Entity
@Table(name = "wists")
data class Wist(

    @Id
    val id: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "ucapan")
    val ucapan: String,

    @Column(name = "id_pernikahan")
    val idPernikahan: String,

    @Column(name = "created_at")
    val createdAt: Date,

    @Column(name = "updated_at")
    val updatedAt: Date?
)
