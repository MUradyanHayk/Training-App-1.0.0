package com.igospel.sawtraxltd.trainingapp.extenssions

import android.content.res.Resources


var Int.dp: Int
    get() {
        return (this * Resources.getSystem().displayMetrics.density).toInt()
    }
    set(value) {}

var Float.dp: Float
    get() {
        return this * Resources.getSystem().displayMetrics.density
    }
    set(value) {}

