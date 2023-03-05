package com.example.shoppinglistcleanarchitecture.domain

class RemoveItemUseCase(private val shoppingListRepository: ShoppingListRepository) {
    fun removeItem(id: Int){
        shoppingListRepository.removeItem(id)
    }
}