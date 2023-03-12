package com.example.shoppinglistcleanarchitecture.domain

class GetShopListUseCase (private val shoppingListRepository: ShoppingListRepository){
    fun getShoppingList(): List<ShoppingItem>{
        return shoppingListRepository.getShoppingList()
    }
}