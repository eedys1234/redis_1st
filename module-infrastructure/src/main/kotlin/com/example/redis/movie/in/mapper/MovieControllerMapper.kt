package com.example.redis.movie.`in`.mapper

import com.example.redis.movie.Reservation
import com.example.redis.reserve.`in`.dto.MovieReserveRequestDto
import com.example.redis.reserve.`in`.dto.MovieReserveSeatRequestDto
import com.example.redis.theater.Seat

class MovieControllerMapper {
    companion object {
        fun toReservationDomain(dto: MovieReserveRequestDto): Reservation {
            return Reservation(
                movieId = dto.movieId,
                screeningId = dto.screeningId,
                userId = dto.userId,
                seats = dto.seats.stream().map { toSeatDomain(it) }.toList()
            )
        }

        private fun toSeatDomain(dto: MovieReserveSeatRequestDto): Seat {
            return Seat(
                seatId = dto.seatId,
                seatRow = dto.seatRow,
                seatCol = dto.seatCol
            )
        }
    }

}