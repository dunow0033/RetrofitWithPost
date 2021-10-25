package com.example.retrofitwithpost

import retrofit2.Call
import retrofit2.http.*

interface RetroService {

    @GET("users")
    @Headers("Accept:application/json", "Content-Type:application/json")
    fun getUsersList(): Call<UserList>

    @GET("users")
    @Headers("Accept:application/json", "Content-Type:application/json")
    fun searchUsers(@Query("name") searchText: String): Call<UserList>

    @GET("users{user_id}")
    @Headers("Accept:application/json", "Content-Type:application/json")
    fun getUsers(@Query("name") searchText: String): Call<UserList>

    @POST("users")
    @Headers("Accept:application/json", "Content-Type:application/json",
    "Authorization:Bearer 37373736492842342394298323923985239857")
    fun createUser(@Body params: User): Call<UserResponse>

    @PATCH("users/{user_id}")
    @Headers("Accept:application/json", "Content-Type:application/json",
    "Authorization: Bearer 37373736492842342394298323923985239857")
    fun updateUser(@Path ("user_id") user_id: String, @Body params: User): Call<UserResponse>
}