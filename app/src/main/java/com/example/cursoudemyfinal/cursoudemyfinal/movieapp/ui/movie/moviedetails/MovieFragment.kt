package com.example.cursoudemyfinal.cursoudemyfinal.movieapp.ui.movie.moviedetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.cursoudemyfinal.R
import com.example.cursoudemyfinal.databinding.FragmentMovieBinding


class MovieFragment : Fragment(R.layout.fragment_movie) {

    private lateinit var  binding: FragmentMovieBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)
         binding = FragmentMovieBinding.bind(view)
    }

}