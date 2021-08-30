package com.htk.presentation.data


import com.htk.presentation.R
import com.htk.presentation.ui.view.home.model.RecTrendInfo

class LocalRecTrendDataSource : RecTrendDataSource {
    override fun fetchData(): MutableList<RecTrendInfo> {
        return mutableListOf<RecTrendInfo>(
            RecTrendInfo(
                recTrendImage = R.drawable.theme_circle,
                recTrendTitle = "고속버스"
            ),
            RecTrendInfo(
                recTrendImage = R.drawable.theme_circle,
                recTrendTitle = "풀빌라"
            ),
            RecTrendInfo(
                recTrendImage = R.drawable.theme_circle,
                recTrendTitle = "물놀이특가"
            ),
            RecTrendInfo(
                recTrendImage = R.drawable.theme_circle,
                recTrendTitle = "아이야놀자"
            ),
            RecTrendInfo(
                recTrendImage = R.drawable.theme_circle,
                recTrendTitle = "호캉스패키지"
            ),
            RecTrendInfo(
                recTrendImage = R.drawable.theme_circle,
                recTrendTitle = "맛집"
            ),


            )
    }
}