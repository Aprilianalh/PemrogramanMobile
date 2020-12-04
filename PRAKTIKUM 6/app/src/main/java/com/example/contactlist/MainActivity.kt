package com.example.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createPhoneData()
        rv_parts.layoutManager = LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)
        rv_parts.adapter = ContactAdapter(testData, {phoneItem : PhoneData -> phoneItemClicked(phoneItem) })
    }
    private fun phoneItemClicked(phoneItem : PhoneData) {
        val showDetailActivityIntent = Intent ( this, PhoneDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, phoneItem.phone.toString() )
        startActivity(showDetailActivityIntent)
    }
    private fun createPhoneData() : List<PhoneData> {
        val partlist = ArrayList<PhoneData> ()
        partlist.add(PhoneData(9864934, "Alpha"))
        partlist.add(PhoneData(1341933, "Bravo"))
        partlist.add(PhoneData(1401624, "Charlie"))
        partlist.add(PhoneData(1234567, "Tariesha"))
        partlist.add(PhoneData(1122334, "Zharfan"))
        return partlist
    }
}
