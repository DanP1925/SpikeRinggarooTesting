package com.example.gus.data.remote.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
        @SerializedName("login") @Expose private val login: String,
        @SerializedName("id") @Expose private val id: Integer,
        @SerializedName("node_id") @Expose private val nodeId: String,
        @SerializedName("avatar_url") @Expose private val avatarUrl: String,
        @SerializedName("gravatar_id") @Expose private val gravatarId: String
){
}
/*"url": "https://api.github.com/users/daniel",
"html_url": "https://github.com/daniel",
"followers_url": "https://api.github.com/users/daniel/followers",
"following_url": "https://api.github.com/users/daniel/following{/other_user}",
"gists_url": "https://api.github.com/users/daniel/gists{/gist_id}",
"starred_url": "https://api.github.com/users/daniel/starred{/owner}{/repo}",
"subscriptions_url": "https://api.github.com/users/daniel/subscriptions",
"organizations_url": "https://api.github.com/users/daniel/orgs",
"repos_url": "https://api.github.com/users/daniel/repos",
"events_url": "https://api.github.com/users/daniel/events{/privacy}",
"received_events_url": "https://api.github.com/users/daniel/received_events",
"type": "User",
"site_admin": false,
"score": 102.99041*/
