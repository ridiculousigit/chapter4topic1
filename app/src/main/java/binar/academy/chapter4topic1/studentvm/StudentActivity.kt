package binar.academy.chapter4topic1.studentvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import binar.academy.chapter4topic1.R

class StudentActivity : AppCompatActivity() {

    lateinit var rvStudent: RecyclerView
    lateinit var adapterStudent: StudentAdapter
    lateinit var studentVm: StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        dataStudent()

        studentVm = ViewModelProvider(this).get(StudentViewModel :: class.java)
        studentVm.getStudent()
        studentVm.studentList.observe(this, Observer {
            adapterStudent.setDataStudent(it as ArrayList<DataStudent> )
        })

    }

    fun dataStudent() {
        rvStudent = findViewById(R.id.rvStudent)
        adapterStudent = StudentAdapter(ArrayList())

        rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvStudent.adapter = adapterStudent
    }
}