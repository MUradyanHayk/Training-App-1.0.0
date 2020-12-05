package com.igospel.sawtraxltd.trainingapp.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.igospel.sawtraxltd.trainingapp.extenssions.dp
import com.igospel.sawtraxltd.trainingapp.model.ItemType
import com.igospel.sawtraxltd.trainingapp.model.MyModel

class MyAdapter(private val context: Context) : RecyclerView.Adapter<MyViewHolder>() {
    var list: MutableList<MyModel>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var item: View? = null
        if (viewType == ItemType.TEXT_TYPE.ordinal) {
            item = TextView(context)
            item?.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        } else if (viewType == ItemType.IMAGE_TYPE.ordinal) {
            item = ImageView(context)
            item?.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 700.dp)
            item?.scaleType = ImageView.ScaleType.CENTER_CROP
        }


        return MyViewHolder(item!!)
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = holder.itemView
        if (list!![position].type == ItemType.TEXT_TYPE) {
            item as TextView
            item.text = list!![position].text
            item.setTextColor(list!![position].textColor)
            item.textSize = list!![position].textSize
        } else if (list!![position].type == ItemType.IMAGE_TYPE) {
            item as ImageView
            item.setBackgroundResource(list!![position].resId)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (list!![position].type) {
            ItemType.TEXT_TYPE -> ItemType.TEXT_TYPE.ordinal
            ItemType.IMAGE_TYPE -> ItemType.IMAGE_TYPE.ordinal
            else -> super.getItemViewType(position)
        }
    }
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)