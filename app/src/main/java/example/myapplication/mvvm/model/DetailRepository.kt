package example.myapplication.mvvm.model

import example.myapplication.api.ApiClient
import example.myapplication.api.response.MovieResponse
import example.myapplication.database.MovieDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

//mengambil data dari repository
class DetailRepository(private val api: ApiClient, private val movieDao: MovieDao) {

    fun getReview(page : Int, id : String) = api.getReview(id, page )

    fun getData(id : Int) = movieDao.findFavouriteById(id)
    suspend fun addFavorite(data : MovieResponse) {
        withContext(Dispatchers.IO) {
            movieDao.insertToFavourite(data)
        }
    }
}