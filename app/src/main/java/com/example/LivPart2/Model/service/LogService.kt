package com.example.livpart2.model.service

interface LogService {
    fun logNonFatalCrash(throwable: Throwable)
}