package com.htk.aos_study.data

import com.htk.aos_study.ui.view.home.model.RecNowGoInfo

interface RecNowGoDataSource {
    fun fetchData() : MutableList<RecNowGoInfo>
}