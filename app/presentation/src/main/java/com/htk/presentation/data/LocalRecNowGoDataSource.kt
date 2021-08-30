package com.htk.presentation.data

import com.htk.aos_study.R
import com.htk.presentation.ui.view.home.model.RecNowGoInfo

class LocalRecNowGoDataSource : RecNowGoDataSource {
    override fun fetchData(): MutableList<RecNowGoInfo> {
        return mutableListOf<RecNowGoInfo>(
            RecNowGoInfo(
                recNowGoImage = R.drawable.theme_circle,
                recNowGoTitle = "제주도"
            ),
            RecNowGoInfo(
                recNowGoImage = R.drawable.theme_circle,
                recNowGoTitle = "강원도"
            ),
            RecNowGoInfo(
                recNowGoImage = R.drawable.theme_circle,
                recNowGoTitle = "부산"
            ),
            RecNowGoInfo(
                recNowGoImage = R.drawable.theme_circle,
                recNowGoTitle = "경상북도"
            ),
        )
    }
}