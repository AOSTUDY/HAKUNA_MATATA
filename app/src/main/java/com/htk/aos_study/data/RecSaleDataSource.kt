package com.htk.aos_study.data

import com.htk.aos_study.ui.view.home.model.RecSaleInfo

interface RecSaleDataSource {
    fun fetchData() : MutableList<RecSaleInfo>
}