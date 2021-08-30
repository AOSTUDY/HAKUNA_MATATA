package com.htk.data.repository.local

import com.htk.data.R
import com.htk.presentation.ui.view.home.model.RecWeeklyInfo

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