package com.htk.presentation.ui.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.htk.aos_study.databinding.FragmentHomeBinding
import com.htk.presentation.ui.base.BaseFragment
import com.htk.presentation.ui.view.home.adapter.TabLayoutAdapter


class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    private val tabText = arrayListOf("추천","국내숙소","즐길거리","교통/항공","해외여행")

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initTabView()


    }


    private fun initTabView(){
        binding.vpHome.adapter = TabLayoutAdapter(requireActivity())
        TabLayoutMediator(binding.tabMain, binding.vpHome){ tab, position ->
            tab.text = tabText[position]

        }.attach()

    }
}
