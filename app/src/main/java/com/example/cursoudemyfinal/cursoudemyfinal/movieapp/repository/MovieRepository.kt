package com.example.cursoudemyfinal.cursoudemyfinal.movieapp.repository

import com.example.cursoudemyfinal.cursoudemyfinal.movieapp.data.model.remote.MovieList

interface MovieRepository {
    suspend fun getUpcomingMovies(): MovieList
    suspend fun getTopRatedMovies(): MovieList
    suspend fun getPopularMovies(): MovieList
}