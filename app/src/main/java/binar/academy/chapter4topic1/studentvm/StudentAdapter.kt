package binar.academy.chapter4topic1.studentvm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import binar.academy.chapter4topic1.R

class StudentAdapter(var listStudent : ArrayList<DataStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var namaStudent = itemView.findViewById<TextView>(R.id.txtNamaStudent)
        var nimStudent = itemView.findViewById<TextView>(R.id.txtNimStudent)
        var imgStudent = itemView.findViewById<ImageView>(R.id.imgStudent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nimStudent.text = listStudent[position].nim
        holder.imgStudent.setImageResource(listStudent[position].img)
    }

    override fun getItemCount(): Int = listStudent.size

    fun setDataStudent( studentList : ArrayList<DataStudent>) {
        this.listStudent = studentList
    }
}