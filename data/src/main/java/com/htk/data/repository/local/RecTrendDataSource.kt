package com.htk.data.repository.local

import com.htk.presentation.ui.view.home.model.RecTrendInfo

interface RecTrendDataSource {
    fun fetchData() : MutableList<RecTrendInfo>
}