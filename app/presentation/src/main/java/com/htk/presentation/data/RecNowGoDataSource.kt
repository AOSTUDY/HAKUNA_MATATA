package com.htk.presentation.data

import com.htk.presentation.ui.view.home.model.RecNowGoInfo

interface RecNowGoDataSource {
    fun fetchData() : MutableList<RecNowGoInfo>
}