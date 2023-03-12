package com.example.shoppinglistcleanarchitecture.domain

import androidx.lifecycle.LiveData

interface ShoppingListRepository {
    fun addShoppingItem(shoppingItem: ShoppingItem)

    fun editShopItem(shoppingItem: ShoppingItem)

    fun getShoppingList(): LiveData<List<ShoppingItem>>

    fun getShoppingItemById(id: Int): ShoppingItem

    fun removeItem(shoppingItem: ShoppingItem)
}