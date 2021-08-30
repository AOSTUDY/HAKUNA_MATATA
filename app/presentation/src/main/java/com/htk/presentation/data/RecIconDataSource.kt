package com.htk.presentation.data

import com.htk.presentation.ui.view.home.model.RecIconInfo

interface RecIconDataSource {
    fun fetchData() : MutableList<RecIconInfo>
}