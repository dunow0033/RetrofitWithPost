package com.example.retrofitwithpost

data class UserList (val data: List<User>)
data class User(val name: String?,
                val id: String?,
                val email: String?,
                val status: String?,
                val gender: String?)
data class UserResponse(val code: Int?, )