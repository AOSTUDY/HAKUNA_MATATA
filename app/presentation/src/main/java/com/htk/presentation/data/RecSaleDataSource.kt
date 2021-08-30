package com.htk.presentation.data

import com.htk.presentation.ui.view.home.model.RecSaleInfo

interface RecSaleDataSource {
    fun fetchData() : MutableList<RecSaleInfo>
}