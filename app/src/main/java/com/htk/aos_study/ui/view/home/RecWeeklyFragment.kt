package com.htk.aos_study.ui.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.htk.aos_study.R
import com.htk.aos_study.data.LocalRecWeeklyDataSource
import com.htk.aos_study.databinding.FragmentRecWeeklyBinding
import com.htk.aos_study.ui.base.BaseFragment
import com.htk.aos_study.ui.view.home.adapter.RecWeeklyAdapter


class RecWeeklyFragment : BaseFragment<FragmentRecWeeklyBinding>() {

    private lateinit var recWeeklyAdapter: RecWeeklyAdapter

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentRecWeeklyBinding {
        return FragmentRecWeeklyBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initWeeklyView()

    }


    private fun initWeeklyView(){
        recWeeklyAdapter = RecWeeklyAdapter()
        binding.recyclerviewWeekly.adapter = recWeeklyAdapter
        recWeeklyAdapter.weekly.addAll(LocalRecWeeklyDataSource().fetchData())
        recWeeklyAdapter.notifyDataSetChanged()


    }
}