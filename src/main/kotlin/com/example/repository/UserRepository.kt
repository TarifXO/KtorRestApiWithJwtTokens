package com.example.repository

import com.example.User
import java.util.UUID

class UserRepository {

    private val users = mutableListOf<User>()

    fun findAll() : List<User> = users

    fun findById(id: UUID) : User? = users.firstOrNull { it.id == id }

    fun findByUserName(username: String) : User? = users.firstOrNull { it.username == username }

    fun save(user: User) : Boolean = users.add(user)
}