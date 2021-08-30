package com.htk.data.repository.local

import com.htk.presentation.ui.view.home.model.RecSaleInfo

interface RecSaleDataSource {
    fun fetchData() : MutableList<RecSaleInfo>
}