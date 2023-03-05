package com.example.shoppinglistcleanarchitecture.domain

data class ShoppingItem(
    val id:Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
)
