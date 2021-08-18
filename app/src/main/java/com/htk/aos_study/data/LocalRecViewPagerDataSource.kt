package com.htk.aos_study.data

import com.htk.aos_study.R
import com.htk.aos_study.ui.view.home.model.RecViewPagerInfo

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