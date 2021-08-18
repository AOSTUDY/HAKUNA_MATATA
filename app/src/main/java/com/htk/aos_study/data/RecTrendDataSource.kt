package com.htk.aos_study.data

import com.htk.aos_study.ui.view.home.model.RecTrendInfo

interface RecTrendDataSource {
    fun fetchData() : MutableList<RecTrendInfo>
}