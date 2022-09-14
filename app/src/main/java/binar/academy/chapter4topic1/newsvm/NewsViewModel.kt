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
            "Walkot Cilegon Datangi Kemenag Usai Heboh Penolakan Gereja",
            "Anggi Muliawati", "Rabu, 14 Sep 2022 10:24 WIB",
            R.drawable.bg_news_cilegon, R.string.body_news2
        ),
        DataNews(
            "Daftar Terbaru Hukuman Etik ke 9 Polisi di Kasus Ferdi Sambo",
            "Dwi Andayani", "Rabu, 14 Sep 2022 09:21 WIB",
            R.drawable.bg_news_sambo, R.string.body_news3
        ),
        DataNews(
            "Suciwati Buka Suara Usai Hacker Bjorka Ungkap Pembunuh Munir",
            "Dwi Andayani", "Rabu, 14 Sep 2022 09:21 WIB<",
            R.drawable.bg_news_munir, R.string.body_news4
        ),
        DataNews(
            "Penembakan Misterius 1980an Ribuan Korban Jiwa, Petrus Beraksi Pertama di Yogya",
            "S. Dian Andryanto", "Minggu, 28 Nov 2021 15:40 WIB",
            R.drawable.bg_news_petrus, R.string.body_news5
        ),
        DataNews(
            "Kronologi Kerusuhan Mei 1998",
            "Verelladevanka Adryamarthanino", "Senin, 15 Nov 2021 15:00 WIB",
            R.drawable.bg_news_mei, R.string.body_news6
        ),
        DataNews(
            "Peristiwa G30S PKI Bukan Pelanggaran HAM Berat, tapi Makar",
            "Tim Liputan Sindo", "Selasa, 26 Jul 2022 09:17 WIB",
            R.drawable.bg_news_onepiece, R.string.body_news7
        ),
        DataNews(
            "Eliza Mengakui Perintah Pengeboman dari Tommy Soeharto",
            "Tim Liputan 6 SCTV", "Minggu, 21 Jan 2001, 08:26 WIB",
            R.drawable.bg_news_bom, R.string.body_news8
        ),
        DataNews(
            "Kelangsungan Pemerintahan Gus Dur Ditentukan 2001",
            "Esther Mulyanie dan Prihandoyo", "Sabtu, 9 Des 2000, 20:52 WIB",
            R.drawable.bg_news_gusdur, R.string.body_news9
        ),
        DataNews(
            "Habibie: Tak Ada Rekayasa buat Timtim",
            "Olivia Rosalia, Agung Nugraha dan Bambang Triono", "Jumat, 21 Mar 2003, 08:44 WIB",
            R.drawable.bg_news_habibie, R.string.body_news10
        )
    )

    val newsList : MutableLiveData<List<DataNews>> = MutableLiveData()

    fun gotNews() {
        newsList.value = list
    }
}