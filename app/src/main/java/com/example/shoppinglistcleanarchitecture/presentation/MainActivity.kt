package com.example.shoppinglistcleanarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.shoppinglistcleanarchitecture.R
import com.example.shoppinglistcleanarchitecture.domain.ShoppingItem

class MainActivity : AppCompatActivity() {
    private val TAG: String = "Main"
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this){
            Log.d(TAG, it.toString())
        }

    }
}