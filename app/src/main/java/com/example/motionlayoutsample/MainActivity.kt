package com.example.motionlayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.view_pager).apply {
            adapter = FragmentPagerAdapter()
        }

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }

    private inner class FragmentPagerAdapter : RecyclerView.Adapter<FragmentViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FragmentViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = inflater.inflate(R.layout.item_page, parent, false)
            return FragmentViewHolder(view)
        }

        override fun getItemCount(): Int = 4

        override fun onBindViewHolder(holder: FragmentViewHolder, position: Int) {
            holder.bind()
        }
    }

    private inner class FragmentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind() {
            itemView.findViewById<RecyclerView>(R.id.list).apply {
                layoutManager = LinearLayoutManager(context)
                adapter = SimpleListAdapter()
            }
        }
    }
}
