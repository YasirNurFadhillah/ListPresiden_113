package com.example.listpresiden

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val nama = arrayOf<String>("Ir. Sukarno", "Suharto", "BJ. Habibie", "Gusdur","Megawati","Susilo Bambang Yudhoyono", "Joko Widodo")
    val detail = arrayOf<String>("1","2","3","4","5","6","7")
    val gambar = arrayOf<Int>(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibi,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.susilo,
        R.drawable.jokowi
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presidenap = PresidenAdapter(this,nama,detail,gambar)
        listpresiden.adapter = presidenap

        listpresiden.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "${nama[position]} adalah Presiden ke -   ${detail[position]}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}