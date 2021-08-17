package com.htk.aos_study.ui.view.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.htk.aos_study.ui.view.home.tab.*

class TabLayoutAdapter(fa : FragmentActivity): FragmentStateAdapter(fa){
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            1 -> RecFragment()
            2 -> DomesticFragment()
            3 -> EntertainmentFragment()
            4 -> TrafficFragment()
            else -> OverseasFragment()
        }
    }
}