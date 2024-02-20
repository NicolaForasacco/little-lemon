package com.example.littlelemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

class Network {
}

@Serializable
@SerialName(value = "")
class MenuNetworkdata(
    val menu: List<MenuItemNetwork>
)


@Serializable
@SerialName(value = "")
class  MenuItemNetwork (
    val id: Int,
    val title: String,
    val description : String,
    val price: Double,
    val image: String,
    val category: String
)