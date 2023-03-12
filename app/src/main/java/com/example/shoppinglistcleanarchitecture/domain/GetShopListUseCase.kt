package com.example.shoppinglistcleanarchitecture.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase (private val shoppingListRepository: ShoppingListRepository){
    fun getShoppingList(): LiveData<List<ShoppingItem>> {
        return shoppingListRepository.getShoppingList()
    }
}