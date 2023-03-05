package com.example.shoppinglistcleanarchitecture.domain

class GetShoppingItemByIdUseCase(private val shoppingListRepository: ShoppingListRepository) {
    fun getShoppingItemById(id: String): ShoppingItem{
        return shoppingListRepository.getShoppingItemById(id)
    }
}