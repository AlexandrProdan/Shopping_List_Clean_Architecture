package com.example.shoppinglistcleanarchitecture.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shoppinglistcleanarchitecture.domain.ShoppingItem
import com.example.shoppinglistcleanarchitecture.domain.ShoppingListRepository

object ShoppingListRepositoryImpl : ShoppingListRepository {
    private val shopList = mutableListOf<ShoppingItem>()
    private val shopListLD = MutableLiveData<List<ShoppingItem>>()

    var autoIncrementId = 0


    init {
        for (i in 0..10) {
            val item = ShoppingItem("Name $i", 0, true)
            addShoppingItem(item)
        }
    }


    override fun addShoppingItem(shoppingItem: ShoppingItem) {
        if (shoppingItem.id == ShoppingItem.UNDEFINED_ID) {
            shoppingItem.id = autoIncrementId++
        }
        shopList.add(shoppingItem)
        updateList()
    }

    override fun editShopItem(shoppingItem: ShoppingItem) {
        val oldElement = getShoppingItemById(shoppingItem.id)
        shopList.remove(oldElement)
        addShoppingItem(shoppingItem)
    }

    override fun getShoppingList(): LiveData<List<ShoppingItem>> {
        updateList()
        return shopListLD
    }

    override fun getShoppingItemById(id: Int): ShoppingItem {
        return shopList.find { it.id == id }
            ?: throw java.lang.RuntimeException("Element with $id not found")
    }

    override fun removeItem(shoppingItem: ShoppingItem) {
        shopList.remove(shoppingItem)
        updateList()
    }

    fun updateList() {
        shopListLD.value = shopList.toList()
    }
}