package com.htk.presentation.data

import com.htk.presentation.ui.view.home.model.RecWeeklyInfo

interface RecWeeklyDataSource {
    fun fetchData() : MutableList<RecWeeklyInfo>
}