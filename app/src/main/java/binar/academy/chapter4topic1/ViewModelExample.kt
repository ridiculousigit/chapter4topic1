package binar.academy.chapter4topic1

import androidx.lifecycle.ViewModel

class ViewModelExample : ViewModel() {

    var hasil = 0

    fun hitungData(panjang : Int, lebar : Int, tinggi : Int) {
        hasil = panjang * lebar * tinggi
    }
}