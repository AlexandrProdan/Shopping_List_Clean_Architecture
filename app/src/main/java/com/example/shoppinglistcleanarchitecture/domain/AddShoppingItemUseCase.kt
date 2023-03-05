package com.example.shoppinglistcleanarchitecture.domain

class AddShoppingItemUseCase(private val shoppingListRepository: ShoppingListRepository) {
    fun addShoppingItem(shoppingItem: ShoppingItem){
        shoppingListRepository.addShoppingItem(shoppingItem)
    }
}