package binar.academy.chapter4topic1.newsvm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import binar.academy.chapter4topic1.R

class NewsAdapter (var listNews : ArrayList<DataNews>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    var buttonClick : ((DataNews) -> Unit)? = null

    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var cvBerita = itemView.findViewById<CardView>(R.id.cvBerita)
        var imgBerita = itemView.findViewById<ImageView>(R.id.imgBerita)
        var judulBerita = itemView.findViewById<TextView>(R.id.judulBerita)
        var tanggalBerita = itemView.findViewById<TextView>(R.id.tanggalBerita)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cvBerita.setOnClickListener {
            buttonClick?.invoke(listNews[position])
        }
        holder.judulBerita.text = listNews[position].headline
        holder.tanggalBerita.text = listNews[position].date
        holder.imgBerita.setImageResource(listNews[position].image)
    }

    override fun getItemCount(): Int = listNews.size

    fun dataBerita (data : ArrayList<DataNews>) {
        this.listNews = data
    }
}