package com.wnf.pernikahan.restapipernikahanwnf.repository

import com.wnf.pernikahan.restapipernikahanwnf.entity.Kehadiran
import org.springframework.data.jpa.repository.JpaRepository

interface KehadiranRepository : JpaRepository<Kehadiran, String> {
}