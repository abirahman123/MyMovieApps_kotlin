package example.myapplication.mvvm.model

import example.myapplication.api.ApiClient

//mengambil data dari repository
class MainRepository(private val api:ApiClient) {
    fun getPopularByPage(page: Int) = api.getPopular(page)
    fun getTopRateByPage(page: Int) = api.getTopRate(page)
    fun getNowPlayingByPage(page: Int) = api.getNowPlaying(page)
}