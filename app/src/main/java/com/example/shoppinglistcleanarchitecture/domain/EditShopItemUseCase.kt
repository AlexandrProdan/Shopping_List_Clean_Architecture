package com.example.shoppinglistcleanarchitecture.domain

class EditShopItemUseCase(private val shoppingListRepository: ShoppingListRepository) {
    fun editShopItem(shoppingItem: ShoppingItem) {
        shoppingListRepository.editShopItem(shoppingItem)
    }
}