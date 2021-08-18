package com.htk.aos_study.data

import com.htk.aos_study.R
import com.htk.aos_study.ui.view.home.model.RecWeeklyInfo

class LocalRecWeeklyDataSource : RecWeeklyDataSource {
    override fun fetchData(): MutableList<RecWeeklyInfo> {
        return mutableListOf(
            RecWeeklyInfo(
                recWeeklyImage = R.drawable.theme_circle,
                recWeeklyTitle = "[GS25] 유어스)틈새라면",
                recWeeklyWon = "1,100원"
            ),
            RecWeeklyInfo(
                recWeeklyImage = R.drawable.theme_circle,
                recWeeklyTitle = "[GS25] 유어스)틈새라면",
                recWeeklyWon = "1,100원"
            ),
            RecWeeklyInfo(
                recWeeklyImage = R.drawable.theme_circle,
                recWeeklyTitle = "[GS25] 유어스)틈새라면",
                recWeeklyWon = "1,100원"
            ),

        )
    }
}