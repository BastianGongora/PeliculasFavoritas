package com.example.peliculasfavoritas.adapters

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.peliculasfavoritas.databinding.MoviesItemBinding
import com.example.peliculasfavoritas.entities.Movies

class MoviesAdapters: RecyclerView.Adapter<MoviesAdapters.MoviesViewHolder>() {

    lateinit var onItemClickListener:(Movies)->Unit

    var movies = mutableListOf<Movies>()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MoviesAdapters.MoviesViewHolder {

        val bindingItem = MoviesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(bindingItem)
    }

    override fun onBindViewHolder(holder: MoviesAdapters.MoviesViewHolder, position: Int) {
        val pelicula: Movies = movies[position]
        holder.bind(pelicula)
    }

    override fun getItemCount(): Int {
        return movies.size
    }




    inner class MoviesViewHolder(private var bindingItem: MoviesItemBinding)
        : RecyclerView.ViewHolder(bindingItem.root){

        val imagen =  bindingItem.ImgenPortada

        fun bind(movie: Movies){

            Glide.with(bindingItem.listMovies)
                .load(movie.UrlImagen)
                .into(imagen)

            with(movie){
                bindingItem.tituloOriginal.text = movie.titulo
                bindingItem.annioMovies.text = movie.annio.toString()
            }
        }
    }




}