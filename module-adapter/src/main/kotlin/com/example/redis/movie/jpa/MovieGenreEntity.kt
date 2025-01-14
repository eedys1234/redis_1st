package com.example.redis.movie

import com.example.redis.BaseEntity
import jakarta.persistence.*

@Table(name = "movie_genre")
@Entity
class MovieGenreEntity(

    @Column(name = "name")
    val name: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    val movie: MovieEntity,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_genre_id")
    val id: Long? = null
): BaseEntity() {
}