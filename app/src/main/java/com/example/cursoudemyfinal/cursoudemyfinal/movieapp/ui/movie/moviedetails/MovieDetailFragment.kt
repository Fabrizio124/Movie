package com.example.cursoudemyfinal.cursoudemyfinal.movieapp.ui.movie.moviedetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.cursoudemyfinal.R
import com.example.cursoudemyfinal.databinding.FragmentMovieDetailBinding


class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {

    private lateinit var binding: FragmentMovieDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
       binding = FragmentMovieDetailBinding.bind(view)
   }

}