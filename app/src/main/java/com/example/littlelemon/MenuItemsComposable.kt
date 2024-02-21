package com.example.littlelemon

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable

@Composable
fun MenuItemsComposable(dishes: List<MenuItem> = listOf()) {
    Column {
        LazyColumn{
            itemsIndexed(dishes){ _,
                                  dish -> MenuItemComposable(dish)
            }
        }
    }
}