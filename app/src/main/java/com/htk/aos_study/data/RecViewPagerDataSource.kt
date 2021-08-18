package com.htk.aos_study.data

import com.htk.aos_study.ui.view.home.model.RecViewPagerInfo

interface RecViewPagerDataSource {
    fun fetchData() : MutableList<RecViewPagerInfo>
}