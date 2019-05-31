package com.example.gus.data

import android.arch.lifecycle.LiveData
import com.example.gus.data.remote.model.User

interface UserRepository {

    suspend fun searchUsers(searchTerm : String) : LiveData<List<User>>

}