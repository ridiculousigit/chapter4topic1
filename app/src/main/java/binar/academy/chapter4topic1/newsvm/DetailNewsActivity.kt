package binar.academy.chapter4topic1.newsvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.academy.chapter4topic1.R
import kotlinx.android.synthetic.main.activity_detail_news.*

class DetailNewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_news)

        toolBar.setOnClickListener {
            val menu = Intent(this, NewsActivity :: class.java)
            startActivity(menu)
        }

        gotData()
    }

    fun gotData() {
        val gotNews = intent.getSerializableExtra("berita") as DataNews
        imgNews.setImageResource(gotNews.image)
        headlineNews.text = gotNews.headline
        authorNews.text = gotNews.author
        dateNews.text = gotNews.date
        bodyNews.setText(gotNews.body)
    }
}