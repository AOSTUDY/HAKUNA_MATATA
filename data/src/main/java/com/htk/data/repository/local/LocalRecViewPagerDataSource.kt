package com.htk.data.repository.local

import com.htk.data.R
import com.htk.presentation.ui.view.home.model.RecViewPagerInfo

class LocalRecViewPagerDataSource: RecViewPagerDataSource {
    override fun fetchData(): MutableList<RecViewPagerInfo> {
        return mutableListOf(
            RecViewPagerInfo(
                recViewPagerImage = R.drawable.mouantin
            ),
            RecViewPagerInfo(
                recViewPagerImage = R.drawable.mouantin
            ),
            RecViewPagerInfo(
                recViewPagerImage = R.drawable.mouantin
            ),
            RecViewPagerInfo(
                recViewPagerImage = R.drawable.mouantin
            ),
            RecViewPagerInfo(
                recViewPagerImage = R.drawable.mouantin
            ),
            RecViewPagerInfo(
                recViewPagerImage = R.drawable.mouantin
            ),
            RecViewPagerInfo(
                recViewPagerImage = R.drawable.mouantin
            ),
            RecViewPagerInfo(
                recViewPagerImage = R.drawable.mouantin
            )
        )
    }
}