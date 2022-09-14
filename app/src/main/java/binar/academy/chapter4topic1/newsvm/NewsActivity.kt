package binar.academy.chapter4topic1.newsvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import binar.academy.chapter4topic1.R
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel : NewsViewModel
    lateinit var adapter : NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        reViewNews()

        viewModel = ViewModelProvider(this).get(NewsViewModel :: class.java)
        viewModel.gotNews()
        viewModel.newsList.observe(this, Observer {
            adapter.dataBerita(it as ArrayList<DataNews>)
        })
    }

    fun reViewNews() {
        adapter = NewsAdapter(ArrayList())
        rvNews.adapter = adapter
        rvNews.layoutManager = LinearLayoutManager(this)
        adapter.buttonClick = {
            val intent = Intent(this, DetailNewsActivity :: class.java)
            intent.putExtra("berita", it)
            startActivity(intent)
        }
    }
}