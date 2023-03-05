package com.example.shoppinglistcleanarchitecture.domain

interface ShoppingListRepository {
    fun addShoppingItem(shoppingItem: ShoppingItem)

    fun editShopItem(shoppingItem: ShoppingItem)

    fun getShoppingList(): ShoppingItem

    fun getShoppingItemById(id: String): ShoppingItem

    fun removeItem(id: Int)
}