package com.htk.data.repository.local

import com.htk.presentation.ui.view.home.model.RecIconInfo

interface RecIconDataSource {
    fun fetchData() : MutableList<RecIconInfo>
}