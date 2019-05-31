package com.example.gus.data

import android.arch.lifecycle.LiveData
import com.example.gus.data.remote.GithubUserRestService
import com.example.gus.data.remote.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher

class UserRepositoryImpl(val githubUserRestService: GithubUserRestService) : UserRepository {

    override suspend fun searchUsers(searchTerm: String): LiveData<List<User>> {
        with(githubUserRestService.searchGithubUsers(searchTerm)) {
            val result = mutableListOf<User>()
            this.items.forEach {
                result.add(githubUserRestService.getUser(it.login))
            }
            return result
        }
    }
}
