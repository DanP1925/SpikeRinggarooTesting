package com.example.gus.data.remote

import android.arch.lifecycle.LiveData
import com.example.gus.data.remote.model.User
import com.example.gus.data.remote.model.UsersList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubUserRestService {

    @GET("/search/users?per_page=2")
    suspend fun searchGithubUsers(@Query("q") searchTerm: String) : UsersList

    @GET("/users/{username}")
    suspend fun getUser(@Path("username") username: String) : User

}