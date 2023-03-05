package com.example.shoppinglistcleanarchitecture.domain

class GetShopListUseCase (private val shoppingListRepository: ShoppingListRepository){
    fun getShoppingList(): ShoppingItem{
        return shoppingListRepository.getShoppingList()
    }
}