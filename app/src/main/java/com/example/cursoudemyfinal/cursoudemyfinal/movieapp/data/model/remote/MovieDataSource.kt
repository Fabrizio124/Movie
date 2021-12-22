package com.example.cursoudemyfinal.cursoudemyfinal.movieapp.data.model.remote

import com.example.cursoudemyfinal.cursoudemyfinal.movieapp.application.AppConstants
import com.example.cursoudemyfinal.cursoudemyfinal.movieapp.repository.WebService

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovies(AppConstants.API_KEY)

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(AppConstants.API_KEY)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(AppConstants.API_KEY)

}