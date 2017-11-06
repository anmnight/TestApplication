package com.example.anxiao.customer_drawable

import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.anxiao.mytestapplication.R
import kotlinx.android.synthetic.main.activity_customer_view_test.*

class CustomerViewTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_view_test)

        val anim:AnimationDrawable = resources.getDrawable(R.drawable.animation_test) as AnimationDrawable
        frame_anim.setBackgroundDrawable(anim)
        anim.start()

    }
}
