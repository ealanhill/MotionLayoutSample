package com.example.motionlayoutsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.motionlayoutsample.collapsible_toolbar.CollapsibleToolbarActivity
import com.example.motionlayoutsample.motion_layout.MotionLayoutActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialButton>(R.id.motion_layout_button).apply {
            setOnClickListener { launchMaterialLayout() }
        }

        findViewById<MaterialButton>(R.id.collapsible_toolbar_button).apply {
            setOnClickListener { launchCollapsibleLayout() }
        }
    }

    private fun launchMaterialLayout() {
        val intent = Intent(this, MotionLayoutActivity::class.java)
        startActivity(intent)
    }

    private fun launchCollapsibleLayout() {
        val intent = Intent(this, CollapsibleToolbarActivity::class.java)
        startActivity(intent)
    }
}
