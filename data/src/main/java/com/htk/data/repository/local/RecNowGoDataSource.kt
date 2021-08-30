package com.htk.data.repository.local

import com.htk.presentation.ui.view.home.model.RecNowGoInfo

interface RecNowGoDataSource {
    fun fetchData() : MutableList<RecNowGoInfo>
}