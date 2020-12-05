package com.igospel.sawtraxltd.trainingapp.model

import android.graphics.Color

class MyModel(
    var text: String? = "",
    var textSize: Float = 16f,
    var textColor: Int = Color.BLACK,
    var resId: Int = -1,
    var type: ItemType = ItemType.TEXT_TYPE
)

enum class ItemType {
    TEXT_TYPE,
    IMAGE_TYPE,
}