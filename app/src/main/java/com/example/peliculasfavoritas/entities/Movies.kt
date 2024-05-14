package com.example.peliculasfavoritas.entities

class Movies(
    val UrlImagen: String,
    val titulo: String,
    val anno: Int // Corregido de 'annio' a 'anno'
) {
    companion object {
        val dataPelicula = mutableListOf(
            Movies(
                "https://static.wikia.nocookie.net/dragonball/images/2/2c/DBZ_Pel%C3%ADcula_15_p%C3%B3ster.png/revision/latest?cb=20180805032328&path-prefix=es",
                "Dragon Ball Super: La resurrección de Freezer",
                2013
            ),
            Movies(
                "https://static.wikia.nocookie.net/dragonball/images/3/31/DBZ_Pel%C3%ADcula_14_p%C3%B3ster.png/revision/latest/scale-to-width-down/100?cb=20180805032328&path-prefix=es",
                "Dragon Ball Super: La batalla de los dioses",
                2015
            ),
            Movies(
                "https://static.wikia.nocookie.net/dragonball/images/f/fb/Dragon_Ball_Super_Broly_poster.png/revision/latest?cb=20180709221734&path-prefix=es",
                "Dragon Ball Super: Broly",
                2018
            ),
            Movies(
                "https://static.wikia.nocookie.net/dragonball/images/c/cb/Cartel_de_Dragon_Ball_Super_Super_Hero_en_Jap%C3%B3n.png/revision/latest/scale-to-width-down/1000?cb=20220302094440&path-prefix=es",
                "Dragon Ball Super: Super Hero",
                2022
            )
        )

        val dataEmpty = mutableListOf<Movies>()
    }
}
