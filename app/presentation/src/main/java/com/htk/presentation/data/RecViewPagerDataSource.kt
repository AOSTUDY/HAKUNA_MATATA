package com.htk.presentation.data

import com.htk.presentation.ui.view.home.model.RecViewPagerInfo

interface RecViewPagerDataSource {
    fun fetchData() : MutableList<RecViewPagerInfo>
}