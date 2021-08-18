package com.htk.aos_study.data

import com.htk.aos_study.ui.view.home.model.RecWeeklyInfo

interface RecWeeklyDataSource {
    fun fetchData() : MutableList<RecWeeklyInfo>
}