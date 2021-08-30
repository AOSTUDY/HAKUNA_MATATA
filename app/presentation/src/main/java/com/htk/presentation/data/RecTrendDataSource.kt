package com.htk.presentation.data

import com.htk.presentation.ui.view.home.model.RecTrendInfo

interface RecTrendDataSource {
    fun fetchData() : MutableList<RecTrendInfo>
}