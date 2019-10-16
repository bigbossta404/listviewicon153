package com.example.listviewicon_153

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon_153.adapter.ListKodinganA
import com.example.listviewicon_153.model.ngodinglist
import com.example.listviewicon_153.model.koding

class MainActivity : AppCompatActivity() {
    private lateinit var revKoding: RecyclerView
    private var list: ArrayList<koding> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        revKoding = findViewById(R.id.listviewicon)
        revKoding.setHasFixedSize(true)
        list.addAll(ngodinglist.listKoding)
        showKodingList()
    }
    private fun showKodingList() {
        revKoding.layoutManager = LinearLayoutManager(this)
        val listkodingAdapter = ListKodinganA(list)
        revKoding.adapter = listkodingAdapter
    }
}
