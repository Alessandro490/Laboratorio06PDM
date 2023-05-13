package com.example.laboratorio05.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.data.models.MovieModel
import com.example.laboratorio05.databinding.MovieItemBinding

class MovieRecyclerViewHolder(private val  binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root)  {

    fun bind (movie: MovieModel, clicklistener: (MovieModel) -> Unit) {
        binding.TitleMovieItemTextView.text = movie.name
        binding.QualificationMovieItemTextView.text = movie.qualification

        binding.MovieItemCardVoew.setOnClickListener{
            clicklistener(movie)
        }
    }
}