package com.example.gus.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
        @SerializedName("login") @Expose private val login: String,
        @SerializedName("id") @Expose private val id: Int,
        @SerializedName("node_id") @Expose private val nodeId: String,
        @SerializedName("avatar_url") @Expose private val avatarUrl: String,
        @SerializedName("gravatar_id") @Expose private val gravatarId: String,
        @SerializedName("url") @Expose private val url: String,
        @SerializedName("html_url") @Expose private val htmlUrl: String,
        @SerializedName("followers_url") @Expose private val followersUrl: String,
        @SerializedName("following_url") @Expose private val followingUrl: String,
        @SerializedName("gists_url") @Expose private val gistsUrl: String,
        @SerializedName("starred_url") @Expose private val starredUrl: String,
        @SerializedName("subscriptions_url") @Expose private val subscriptionsUrl: String,
        @SerializedName("organizations_url") @Expose private val organizationsUrl: String,
        @SerializedName("repos_url") @Expose private val reposUrl: String,
        @SerializedName("events_url") @Expose private val eventsUrl: String,
        @SerializedName("received_events_url") @Expose private val receivedEventsUrl: String,
        @SerializedName("type") @Expose private val type: String,
        @SerializedName("site_admin") @Expose private val siteAdmin: Boolean,
        @SerializedName("score") @Expose private val score: Float
)
