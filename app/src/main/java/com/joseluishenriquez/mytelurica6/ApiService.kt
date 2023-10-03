package com.joseluishenriquez.mytelurica6

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("sismos")
    fun getPost() : Call<MutableList<PostModel>>
}