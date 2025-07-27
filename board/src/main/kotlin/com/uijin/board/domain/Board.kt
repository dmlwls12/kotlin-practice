package com.uijin.board.domain

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Board (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    var title: String,

    @Column(columnDefinition = "TEXT")
    var content: String,

    val createdAt: LocalDateTime = LocalDateTime.now()
)