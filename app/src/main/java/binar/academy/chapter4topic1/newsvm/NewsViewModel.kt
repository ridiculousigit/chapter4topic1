package binar.academy.chapter4topic1.newsvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import binar.academy.chapter4topic1.R

class NewsViewModel : ViewModel() {
    val list = arrayListOf(
        DataNews(
            "Film One Piece: Red Raup Untung Rp 1,2 Triliun",
            "Tia Agnes Astuti", "Jumat, 02 Sep 2022 10:51 WIB",
            R.drawable.bg_news_onepiece, R.string.body_news1
        ),
        DataNews(
            "Film One Piece: Red Raup Untung Rp 1,2 Triliun",
            "Tia Agnes Astuti", "Jumat, 02 Sep 2022 10:51 WIB",
            R.drawable.bg_news_onepiece,
            R.string.body_news1
        ),
        DataNews(
            "Film One Piece: Red Raup Untung Rp 1,2 Triliun",
            "Tia Agnes Astuti", "Jumat, 02 Sep 2022 10:51 WIB",
            R.drawable.bg_news_onepiece,
            R.string.body_news1
        ),
        DataNews(
            "Film One Piece: Red Raup Untung Rp 1,2 Triliun",
            "Tia Agnes Astuti", "Jumat, 02 Sep 2022 10:51 WIB",
            R.drawable.bg_news_onepiece,
            R.string.body_news1
        ),
        DataNews(
            "Film One Piece: Red Raup Untung Rp 1,2 Triliun",
            "Tia Agnes Astuti", "Jumat, 02 Sep 2022 10:51 WIB",
            R.drawable.bg_news_onepiece,
            R.string.body_news1),
        DataNews(
            "Film One Piece: Red Raup Untung Rp 1,2 Triliun",
            "Tia Agnes Astuti", "Jumat, 02 Sep 2022 10:51 WIB",
            R.drawable.bg_news_onepiece,
            R.string.body_news1
        ),
        DataNews(
            "Film One Piece: Red Raup Untung Rp 1,2 Triliun",
            "Tia Agnes Astuti",
            "Jumat, 02 Sep 2022 10:51 WIB",
            R.drawable.bg_news_onepiece,
            R.string.body_news1
        )
    )

    val newsList : MutableLiveData<List<DataNews>> = MutableLiveData()

    fun gotNews() {
        newsList.value = list
    }
}