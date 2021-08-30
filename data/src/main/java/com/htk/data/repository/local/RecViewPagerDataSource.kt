package com.htk.data.repository.local

import com.htk.presentation.ui.view.home.model.RecViewPagerInfo

interface RecViewPagerDataSource {
    fun fetchData() : MutableList<RecViewPagerInfo>
}