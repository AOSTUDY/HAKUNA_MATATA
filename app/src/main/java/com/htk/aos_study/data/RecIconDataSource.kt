package com.htk.aos_study.data

import com.htk.aos_study.ui.view.home.model.RecIconInfo

interface RecIconDataSource {
    fun fetchData() : MutableList<RecIconInfo>
}