package com.example.vitruviusapplication.base

interface EventHandler<T> {
    fun obtainEvent(event: T)
}