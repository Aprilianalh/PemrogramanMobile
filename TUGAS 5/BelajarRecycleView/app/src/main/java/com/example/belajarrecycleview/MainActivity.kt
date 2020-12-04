package com.example.belajarrecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "Anita",
        "Bella",
        "Chintia",
        "Dhimas",
        "Elmo",
        "Firman",
        "Gita",
        "Hanum",
        "Insani",
        "Jelita"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager (this)
        for (i in 0 until listUsers.size) {
            //modif Latihan 2 penambahan teks "Halo"
            list.add(Users(listUsers.get(i), "Halo"))
            if (listUsers.size - 1 == i) {
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecyclerView.adapter = adapter
            }
        }
    }
}
