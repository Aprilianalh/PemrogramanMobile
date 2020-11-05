package com.example.uts1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacAdapter(data) { onItem: Faculty ->
            onItemClicked(onItem) }
    }
    private fun onItemClicked(onItem: Faculty) {
        val showDetailActivityIntent = Intent(this, FacDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, onItem.logo)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.name)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.description)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<Faculty> {
        val rvList = ArrayList<Faculty>()
        rvList.add(
            Faculty(
                R.drawable.upn,
                "Fakultas Ilmu Komputer",
                "Fakultas \t\t\t\t\t Ilmu \t\t\t\t\t Komputer merupakan salah satu dari dari 7 Fakultas \t di UPN \"Veteran\" \t Jawa Timur. \t Yang terdiri dari program studi : ",
                "\t\t\t 1. \t Teknik Informatika\n" +
                        "\t\t\t 2. \t Sistem Informasi"
            )
        )
        rvList.add(
            Faculty(
                R.drawable.upn,
                "Fakultas Teknik",
                "Fakultas Teknik\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "\t\t\t 1. Teknik Kimia\n" +
                        "\t\t\t 2. Teknik Industri\n" +
                        "\t\t\t 3. Teknik Sipil\n" +
                        "\t\t\t 4. Teknik Lingkungan\n" +
                        "\t\t\t 5. Teknologi Pangan"
            )
        )
        rvList.add(
            Faculty(
                R.drawable.upn,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "\t\t\t 1. Ekonomi Pembangunan\n" +
                        "\t\t\t 2. Akuntansi\n" +
                        "\t\t\t 3. Manajemen"
            )
        )
        rvList.add(
            Faculty(
                R.drawable.upn,
                "Fakultas Pertanian",
                "Fakultas Pertanian\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "\t\t\t 1. Agroteknologi\n" +
                        "\t\t\t 2. Agribisnis"
            )
        )
        rvList.add(
            Faculty(
                R.drawable.hanum,
                "Profil Singkat",
                "Nama : Apriliana Latifah Hanum \n"+
                        "TTL : Surabaya, 19 April 2000 \n" +
                        "Alamat : Dukuh Bulak Banteng, Surabaya \n" +
                        "No. HP : 08980639045 \n" +
                        "Email : Aprilianalh@gmail.com \n" +
                        "Github : https://github.com/Aprilianalh \n",
                "Riwayat Pendidikan : \n" +
                        "1. SDN Tanah Kali Kedinding 5 Surabaya \n" +
                        "2. SMPN 31 Surabaya \n" +
                        "3. SMA Muhammadiyah 1 Surabaya \n\n\n"+
                        "Prestasi : \n"+
                        "1. Tari Remo Masal Peresmian Gelora Bung Tomo (SD) \n"+
                        "2. Juara 3 Tari Remo Se-Kecamatan (SD) \n"+
                        "3. Juara 5 Tari Remo Se-Surabaya (SMP)\n"+
                        "4. Juara 2 Tari Kreasi Se-Surabaya (SMP) \n"+
                        "5. Juara 1 Tari Kreasi Se-Kecamatan (SMA) \n"+
                        "6. Juara 6 Tari Kreasi Se-Surabaya (SMA) \n"
            )
        )
        return rvList
    }
}
