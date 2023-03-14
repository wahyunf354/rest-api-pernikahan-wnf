package com.wnf.pernikahan.restapipernikahanwnf.model

import java.util.Date

data class WistResponse(

    val id:String,

    val name: String,

    val ucapan: String,

    val id_pernikahan: String,

    val created_at: Date,

    val updated_at: Date?

)
