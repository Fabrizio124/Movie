package com.example.cursoudemyfinal.cursoudemyfinal.movieapp.repository

import com.example.cursoudemyfinal.cursoudemyfinal.movieapp.data.model.remote.MovieDataSource
import com.example.cursoudemyfinal.cursoudemyfinal.movieapp.data.model.remote.MovieList

class MovieRepositoryImpl(private val dataSource: MovieDataSource): MovieRepository {

    override suspend fun getUpcomingMovies(): MovieList = dataSource.getUpcomingMovies()

    override suspend fun getTopRatedMovies(): MovieList = dataSource.getTopRatedMovies()

    override suspend fun getPopularMovies(): MovieList = dataSource.getPopularMovies()

}