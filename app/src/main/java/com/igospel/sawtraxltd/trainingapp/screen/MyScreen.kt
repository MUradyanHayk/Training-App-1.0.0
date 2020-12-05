package com.igospel.sawtraxltd.trainingapp.screen

import android.content.Context
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.igospel.sawtraxltd.trainingapp.adapter.MyAdapter

class MyScreen(context: Context) : FrameLayout(context) {
    var recyclerView: RecyclerView? = null
    var adapter: MyAdapter? = null

    init {
        createRecyclerView()
    }

    private fun createRecyclerView() {
        recyclerView = RecyclerView(context)
        adapter = MyAdapter(context)
        recyclerView?.adapter = adapter
        recyclerView?.layoutManager = LinearLayoutManager(context)
        recyclerView?.layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        addView(recyclerView)
    }

}