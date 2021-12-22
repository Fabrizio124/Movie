package com.example.cursoudemyfinal.cursoudemyfinal.movieapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cursoudemyfinal.cursoudemyfinal.movieapp.core.Resource
import com.example.cursoudemyfinal.cursoudemyfinal.movieapp.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import okhttp3.Dispatcher
import java.lang.Exception

class MovieViewModel(private val repo: MovieRepository): ViewModel() {

    fun fetchUpcomingMovies() = liveData(Dispatchers.IO){
        emit(Resource.Loading())
        try {
             emit(Resource.Succes(repo.getUpcomingMovies()))
        }catch (e:Exception) {
             emit(Resource.Failure(e))
        }

    }
}