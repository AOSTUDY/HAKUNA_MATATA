package com.htk.presentation.ui.view.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.htk.presentation.ui.view.home.tab.*

class TabLayoutAdapter(fa : FragmentActivity): FragmentStateAdapter(fa){
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> RecFragment()
            1 -> DomesticFragment()
            2 -> EntertainmentFragment()
            3 -> TrafficFragment()
            else -> OverseasFragment()
        }
    }
}