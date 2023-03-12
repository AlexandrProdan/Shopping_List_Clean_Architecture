package com.example.shoppinglistcleanarchitecture.domain

interface ShoppingListRepository {
    fun addShoppingItem(shoppingItem: ShoppingItem)

    fun editShopItem(shoppingItem: ShoppingItem)

    fun getShoppingList(): List<ShoppingItem>

    fun getShoppingItemById(id: Int): ShoppingItem

    fun removeItem(shoppingItem: ShoppingItem)
}