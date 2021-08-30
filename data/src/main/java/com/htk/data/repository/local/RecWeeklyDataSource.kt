package com.htk.data.repository.local

import com.htk.presentation.ui.view.home.model.RecWeeklyInfo

interface RecWeeklyDataSource {
    fun fetchData() : MutableList<RecWeeklyInfo>
}