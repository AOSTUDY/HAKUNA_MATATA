package com.htk.presentation.ui.view.home.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.htk.aos_study.R
import com.htk.aos_study.data.*
import com.htk.aos_study.databinding.FragmentRecBinding
import com.htk.presentation.ui.base.BaseFragment
import com.htk.presentation.ui.view.home.RecWeeklyFragment
import com.htk.aos_study.ui.view.home.adapter.*
import com.htk.presentation.data.*
import com.htk.presentation.ui.view.home.adapter.*


class RecFragment : BaseFragment<FragmentRecBinding>() {
    private lateinit var recTrendAdapter : RecTrendAdapter
    private lateinit var recIconAdapter : RecIconAdapter
    private lateinit var recViewPagerAdapter : RecViewPagerAdapter
    private lateinit var recSaleAdapter: RecSaleAdapter
    private lateinit var recNowGoAdapter : RecNowGoAdapter


    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentRecBinding {
        return FragmentRecBinding.inflate(inflater, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initTrendView()
        initIconView()
        initViewPager()
        initSale()
        initNowGo()
        initWeeklyView()
    }



    private fun initTrendView(){
        recTrendAdapter = RecTrendAdapter()
        binding.recyclerviewTrend.adapter = recTrendAdapter
        recTrendAdapter.trend.addAll(LocalRecTrendDataSource().fetchData())
        recTrendAdapter.notifyDataSetChanged()

    }

    private fun initIconView(){
        recIconAdapter = RecIconAdapter()
        binding.recyclerviewIcon.adapter = recIconAdapter
        recIconAdapter.icon.addAll(LocalRecIconDataSource().fetchData())
        recIconAdapter.notifyDataSetChanged()

    }

    private fun initViewPager(){
        recViewPagerAdapter = RecViewPagerAdapter()
        binding.vpRec.adapter = recViewPagerAdapter
        recViewPagerAdapter.view.addAll(LocalRecViewPagerDataSource().fetchData())
        recViewPagerAdapter.notifyDataSetChanged()

    }

    private fun initSale(){
        recSaleAdapter = RecSaleAdapter()
        binding.recyclerviewSale.adapter = recSaleAdapter
        recSaleAdapter.sale.addAll(LocalRecSaleDataSource().fetchData())
        recSaleAdapter.notifyDataSetChanged()

    }

    private fun initNowGo(){
        recNowGoAdapter = RecNowGoAdapter()
        binding.recyclerviewNowGo.adapter = recNowGoAdapter
        recNowGoAdapter.nowGo.addAll(LocalRecNowGoDataSource().fetchData())
        recNowGoAdapter.notifyDataSetChanged()

    }

    private fun initWeeklyView(){
        binding.apply{
            val recWeeklyTabAdapter = RecWeeklyTabAdapter(requireActivity())
            with(recWeeklyTabAdapter){
                fragments = listOf(
                    RecWeeklyFragment(),
                    RecWeeklyFragment(),
                    RecWeeklyFragment(),
                    RecWeeklyFragment(),
                    RecWeeklyFragment(),
                    RecWeeklyFragment(),
                )
            }
            with(vpRecWeekly){
                adapter = recWeeklyTabAdapter
            }

            TabLayoutMediator(tabRecWeekly, vpRecWeekly){ tab, position ->
                when(position){

                    0 -> tab.setCustomView(R.layout.weekly_one)
                    1 -> tab.setCustomView(R.layout.weekly_two)
                    2 -> tab.setCustomView(R.layout.weekly_three)
                    3 -> tab.setCustomView(R.layout.weekly_four)
                    4 -> tab.setCustomView(R.layout.weekly_five)
                    5 -> tab.setCustomView(R.layout.weekly_six)
                }


            }.attach()
        }

    }
}