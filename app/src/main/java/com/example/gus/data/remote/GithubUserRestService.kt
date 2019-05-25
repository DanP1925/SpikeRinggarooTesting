package com.example.gus.data.remote

import retrofit2.http.GET

interface GithubUserRestService {

    @GET("/search/users?per_page=2")
    suspend fun searchGithubUsers()


}