package com.example.demo.service

import com.example.demo.model.dto.UserAddRequest
import com.example.demo.model.dto.UserDto

interface UserService {
    fun AddUser(request: UserAddRequest?): UserDto?
    val allUser: MutableList<UserDto?>?
    fun getUserById(id: String?): UserDto?
    fun UpdateUser(id: String?, request: UserAddRequest?): UserDto?
    fun DeleteUser(id: String?)
}