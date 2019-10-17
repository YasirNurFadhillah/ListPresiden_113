package com.example.listpresiden

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class PresidenAdapter(
    private val context: Activity,
    private val nama: Array<String>,
    private val detail : Array<String>,
    private val gambar: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.layouttampilan, nama) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.layouttampilan, null, true)
        val titleText = rowView.findViewById(R.id.nama) as TextView
        val imageView = rowView.findViewById(R.id.gambar) as ImageView

        titleText.text = nama[position]
        imageView.setImageResource(gambar[position])

        return rowView
    }
}