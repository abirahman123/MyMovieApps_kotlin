package example.myapplication.mvvm.model

import example.myapplication.database.MovieDao

//mengambil data dari repository
class FavouriteRepository ( private val movieDao: MovieDao) {
    fun getMoviesLimit(limit : Int) = movieDao.findFavouriteLimit(limit)
}