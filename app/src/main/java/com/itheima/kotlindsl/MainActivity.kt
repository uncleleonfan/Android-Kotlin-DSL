package com.itheima.kotlindsl

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val frameLayout = FrameLayout(this)
//        val textView = TextView(this)
//        textView.text = "Hello World!"
//        frameLayout.addView(textView)

        val frameLayout = frameLayout {
            textView("Hello World") {
            }
        }

        setContentView(frameLayout)
    }
}
