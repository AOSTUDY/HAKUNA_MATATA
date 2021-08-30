package com.htk.data.repository.local

import com.htk.data.R
import com.htk.presentation.ui.view.home.model.RecIconInfo

class LocalRecIconDataSource: RecIconDataSource {
    override fun fetchData(): MutableList<RecIconInfo> {
        return mutableListOf(
            RecIconInfo(
                recIconImage = R.drawable.ic_launcher_background,
                recIconTitle = "돈버는놀테크"
            ),
            RecIconInfo(
                recIconImage = R.drawable.theme_circle,
                recIconTitle = "코인뽑기머신"
            ),
            RecIconInfo(
                recIconImage = R.drawable.theme_circle,
                recIconTitle = "나만의쿠폰"
            ),
            RecIconInfo(
                recIconImage = R.drawable.theme_circle,
                recIconTitle = "카드할인"
            ),
            RecIconInfo(
                recIconImage = R.drawable.theme_circle,
                recIconTitle = "8월혜택모음"
            ),
            RecIconInfo(
                recIconImage = R.drawable.theme_circle,
                recIconTitle = "선착순쿠폰"
            ),
            RecIconInfo(
                recIconImage = R.drawable.theme_circle,
                recIconTitle = "무한쿠폰룸"
            ),
            RecIconInfo(
                recIconImage = R.drawable.theme_circle,
                recIconTitle = "모텔특가"
            ),
            RecIconInfo(
                recIconImage = R.drawable.theme_circle,
                recIconTitle = "호텔특가"
            ),
            RecIconInfo(
                recIconImage = R.drawable.theme_circle,
                recIconTitle = "펜션특가"
            )
        )
    }
}