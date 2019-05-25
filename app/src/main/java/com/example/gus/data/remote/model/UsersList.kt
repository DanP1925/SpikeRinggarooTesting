package com.example.gus.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UsersList(
        @SerializedName("total_count") @Expose private val totalCount: Int,
        @SerializedName("items") @Expose private val items: List<User>
)

