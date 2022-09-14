package binar.academy.chapter4topic1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class UsingViewModelActivity : AppCompatActivity() {

    lateinit var editPanjang : EditText
    lateinit var editLebar : EditText
    lateinit var editTinggi : EditText
    lateinit var btnHitung : Button
    lateinit var txtHasil : TextView
    lateinit var viewModel : ViewModelExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_using_view_model)

        editPanjang = findViewById(R.id.editPanjang)
        editLebar = findViewById(R.id.editLebar)
        editTinggi = findViewById(R.id.editTinggi)
        btnHitung = findViewById(R.id.btnHitung)
        txtHasil = findViewById(R.id.txtHasil)

        viewModel = ViewModelProvider(this).get(ViewModelExample :: class.java)
        txtHasil.text = viewModel.hasil.toString()

        btnHitung.setOnClickListener {
            var pi = editPanjang.text.toString().toInt()
            var lb = editLebar.text.toString().toInt()
            var tg = editTinggi.text.toString().toInt()
            viewModel.hitungData(pi, lb, tg)
            txtHasil.text = viewModel.hasil.toString()
            // hasilData()
        }
    }

    fun hasilData() {
        txtHasil.text = viewModel.hasil.toString()
    }
}