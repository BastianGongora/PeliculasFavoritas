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

        val imagen = bindingItem.imgPortada // Puedes acceder directamente a 'imgPortada' desde 'bindingItem'

        fun bind(movie: Movies) {

            // Utiliza Glide para cargar la imagen en el ImageView 'imagen' dentro de 'bindingItem'
            Glide.with(bindingItem.root.context) // Accede al contexto directamente desde 'root'
                .load(movie.UrlImagen) // Utiliza 'imageUrl' para acceder a la URL de la imagen
                .into(imagen) // Puedes usar directamente 'imagen' aquí

            // Establece el título y el año de la película en los TextView correspondientes dentro de 'bindingItem'
            with(bindingItem) { // Accede directamente a 'bindingItem' usando 'with'
                tituloOriginal.text = movie.titulo // Cambiado 'movies.titulo' a 'movie.title' para acceder a la propiedad correctamente
                annioMovies.text = movie.anno.toString() // Cambiado 'movies.annio' a 'movie.year' para acceder a la propiedad correctamente
            }
        }

    }




}