package com.example.motionlayoutsample.collapsible_toolbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.motionlayoutsample.R
import com.example.motionlayoutsample.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class CollapsibleToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_collapsible_toolbar)

        val viewPager = findViewById<ViewPager2>(R.id.view_pager_collapsible).apply {
            adapter = ViewPagerAdapter()
        }

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout_collapsible)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }
}
