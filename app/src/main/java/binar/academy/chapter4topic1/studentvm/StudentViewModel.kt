package binar.academy.chapter4topic1.studentvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import binar.academy.chapter4topic1.R

class StudentViewModel : ViewModel() {

    val list = arrayListOf(
        DataStudent("Sigit", "57419199", R.drawable.ic_launcher_background),
        DataStudent("Jason", "57419198", R.drawable.ic_launcher_background),
        DataStudent("Theo", "57419197", R.drawable.ic_launcher_background)
    )

    val studentList : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudent() {
        var murid = list
        studentList.value = murid
    }
}