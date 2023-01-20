package com.example.livpart2.model.service

interface StorageService {
    suspend fun delete(userId: String)
}