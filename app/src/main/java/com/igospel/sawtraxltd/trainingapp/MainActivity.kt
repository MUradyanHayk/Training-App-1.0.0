package com.igospel.sawtraxltd.trainingapp

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.igospel.sawtraxltd.trainingapp.fragment.MyFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val containerView = FrameLayout(this)
        containerView.id = R.id.container_id
        setContentView(containerView)
        supportFragmentManager.beginTransaction().add(R.id.container_id, MyFragment()).commit()

    }
}