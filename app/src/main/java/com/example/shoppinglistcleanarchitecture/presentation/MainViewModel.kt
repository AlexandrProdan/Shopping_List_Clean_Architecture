package com.example.shoppinglistcleanarchitecture.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppinglistcleanarchitecture.data.ShoppingListRepositoryImpl
import com.example.shoppinglistcleanarchitecture.domain.EditShopItemUseCase
import com.example.shoppinglistcleanarchitecture.domain.GetShopListUseCase
import com.example.shoppinglistcleanarchitecture.domain.RemoveItemUseCase
import com.example.shoppinglistcleanarchitecture.domain.ShoppingItem

class MainViewModel: ViewModel() {

    private val repository = ShoppingListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val removeItemUseCase = RemoveItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShoppingList()



    fun removeItem(shoppingItem: ShoppingItem){
        removeItemUseCase.removeItem(shoppingItem)
    }

    fun changeEnabledState(shoppingItem: ShoppingItem){
        val newItem = shoppingItem.copy(enabled = !shoppingItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }

}