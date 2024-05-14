package com.example.peliculasfavoritas

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.peliculasfavoritas.adapters.MoviesAdapters
import com.example.peliculasfavoritas.databinding.ActivityMainBinding
import com.example.peliculasfavoritas.entities.Movies

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerPelicula.layoutManager = LinearLayoutManager(this)

        initAdapter()

    }
    fun initAdapter(){
        val peliculaAdapter = MoviesAdapters()
        binding.recyclerPelicula.adapter = peliculaAdapter
        peliculaAdapter.movies = Movies.dataPelicula

    }

}