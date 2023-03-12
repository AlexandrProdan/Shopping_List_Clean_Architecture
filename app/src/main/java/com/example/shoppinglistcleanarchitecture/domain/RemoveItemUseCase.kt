package com.example.shoppinglistcleanarchitecture.domain

class RemoveItemUseCase(private val shoppingListRepository: ShoppingListRepository) {
    fun removeItem(shoppingItem: ShoppingItem){
        shoppingListRepository.removeItem(shoppingItem)
    }
}