package com.igospel.sawtraxltd.trainingapp.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.igospel.sawtraxltd.trainingapp.R
import com.igospel.sawtraxltd.trainingapp.model.ItemType
import com.igospel.sawtraxltd.trainingapp.model.MyModel
import com.igospel.sawtraxltd.trainingapp.screen.MyScreen

class MyFragment : Fragment() {
    var screen: MyScreen? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        screen = MyScreen(context!!)
        val params = FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        screen?.layoutParams = params
        screen?.setBackgroundColor(Color.RED)
        screen?.adapter?.list = createDataSource()
        return screen
    }

    private fun createDataSource(): MutableList<MyModel> {
        val list = mutableListOf<MyModel>()

        var model = MyModel()
        model.text = "aaaaaaa"
        model.textSize = 18f
        model.type = ItemType.TEXT_TYPE
        list.add(model)

        model = MyModel()
        model.text = "bbbbbbb"
        model.textSize = 18f
        model.type = ItemType.TEXT_TYPE
        list.add(model)

        model = MyModel()
        model.text = "cccccc"
        model.textSize = 18f
        model.type = ItemType.TEXT_TYPE
        list.add(model)

        model = MyModel()
        model.text = "cccccc"
        model.textSize = 18f
        model.type = ItemType.TEXT_TYPE
        list.add(model)

        model = MyModel()
        model.resId = R.drawable.how_to_use_app_imag_4
        model.type = ItemType.IMAGE_TYPE
        list.add(model)

        model = MyModel()
        model.text = "cccccc"
        model.textSize = 18f
        model.type = ItemType.TEXT_TYPE
        list.add(model)

        model = MyModel()
        model.text = "cccccc"
        model.textSize = 18f
        model.type = ItemType.TEXT_TYPE
        list.add(model)

        model = MyModel()
        model.type = ItemType.IMAGE_TYPE
        model.resId = R.drawable.how_to_use_app_image_1
        list.add(model)

        model = MyModel()
        model.text = "cccccc"
        model.textSize = 18f
        model.type = ItemType.TEXT_TYPE
        list.add(model)

        model = MyModel()
        model.resId = R.drawable.how_to_use_app_image_1
        model.type = ItemType.IMAGE_TYPE
        list.add(model)

        model = MyModel()
        model.text = "cccccc"
        model.textSize = 18f
        model.type = ItemType.TEXT_TYPE
        list.add(model)

        model = MyModel()
        model.resId = R.drawable.how_to_use_app_image_1
        model.type = ItemType.IMAGE_TYPE
        list.add(model)

        return list
    }
}