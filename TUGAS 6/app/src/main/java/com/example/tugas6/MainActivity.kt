package com.example.tugas6

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
        rv_list_main.adapter = JajananAdapter(data) { onItem: Jajanan ->
            onItemClicked(onItem) }
    }
    private fun onItemClicked(onItem: Jajanan) {
        val showDetailActivityIntent = Intent(this, JajananDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, onItem.pict)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.name)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.description)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.deskDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<Jajanan> {
        val rvList = ArrayList<Jajanan>()
        rvList.add(
            Jajanan(
                R.drawable.pentol,
                "Pentol Gila",
                "Pentol gila hadir di Surabaya dengan kombinasi dari dua kota yaitu Madiun dan Gresik yang dapat mengobati rasa rindu kalian terhadap jajanan tradisional yang murah, enak dan lezat dengan cara penyajiannya yang berbeda. Pentol gila hadir dan menjadi pelopor pentol modern pertama, dengan isian yang banyak macamnya sejak tahun 2012. Ditambah banyak varian sambal dan saos untuk menemani jajanan tradisional ini. Selamat menikmati pentol gila!",
                "Menu : \n"+
                        "•  Paket Petarung (Favorit) \n" +
                        "\t\t -> Rp 12.000  \n" +
                        "•  Paket Suro (Tampilan Menipu) \n" +
                        "\t\t -> Rp 13.000 \n" +
                        "•  Paket Gila Aja (Original) \n" +
                        "\t\t -> Rp 15.000 \n" +
                        "•  Paket Ramah 1 (Hujan Keju) \n" +
                        "\t\t -> Rp 13.000 \n" +
                        "•  Paket Ramah 2 (Ala Takoyaki) \n" +
                        "\t\t -> Rp 14.000 \n" +
                        "•  Pentol Goreng (Gurih Mantab) \n" +
                        "\t\t -> Rp 14.000 \n\n"+
                        "Outlet : \n"+
                        "•  Foodcourt Royal Plaza Lantai 3 \n"+
                        "\t Buka: Setiap hari jam 10.00 – 21.30 \n" +
                        "•  Foodcourt TP 1 Lantai 5 \n"+
                        "\t Buka: Setiap hari jam 10.00 – 22.00 \n" +
                        "•  Foodcourt BG Junction Lantai L2 \n" +
                        "\t Buka: Setiap hari jam 10.00 – 21.30 \n" +
                        "•  Jl. Gubeng Airlangga 2/9 \n" +
                        "\t Buka: Setiap hari jam 09.30 – 21.30 \n" +
                        "•  Jl. Raya Menur 2 \n" +
                        "\t Buka: Setiap hari jam 08.00 – 21.00 \n" +
                        "•  Jl. Rungkut Madya 99 \n" +
                        "\t Buka: Setiap hari jam 11.00-21.00 \n\n"
            )
        )
        rvList.add(
            Jajanan(
                R.drawable.tahu,
                "Tahu Go !",
                "TAHU GO !\n" +
                        "menghadirkan sajian tahu goreng istimewa dengan bahan tahu pilihan dan racikan bumbu rahasia khusus, yang sangat menggugah selera.\n" +
                        "TAHU GO ! kriuknya bikin nagih !",
                "Menu : \n" +
                        "Tahu GO! -> Rp 16.000 / 10pcs \n\n " +
                        "Outlet : \n" +
                        "•  Jl. Nginden Semolo No. 90, Nginden \n" +
                        "•  Jl. Puri Widya Kencana No. 1 \n" +
                        "•  Ruko San Antonio N1-69 \n\n" +
                        "Note : \n" +
                        "-> Buka: Setiap hari jam 17.00 - 22.30 \n\n"
            )
        )
        rvList.add(
            Jajanan(
                R.drawable.pokpok,
                "POK POK My Crispy Snack",
                "POK POK My Crispy Snack merupakan salah satu perusahaan streetfood yang sudah memiliki banyak cabang hampir diseluruh mall dan pusat perbelanjaan di Surabaya. Saat ini POK POK My crispy snack sudah memiliki cabang di dalam maupun di luar Pulau Jawa.  POK POK My Crispy Snack bergerak dibidang olahan ayam dengan berbagai rasa yg dapat dinikmati oleh semua kalangan.",
                "Menu : \n" +
                        "•  Crispy Chicken \n" +
                        "\t\t -> Rp 20.000 \n" +
                        "•  Chicken Pokcorn \n" +
                        "\t\t -> Rp 15.000 \n" +
                        "•  Chicken Pokkin \n" +
                        "\t\t -> Rp 15.000 \n" +
                        "•  Crispy Dori \n" +
                        "\t\t -> Rp 23.000 \n" +
                        "•  Crispy Squid \n" +
                        "\t\t -> Rp 25.000 \n" +
                        "•  Chicken Karaage \n" +
                        "\t\t -> Rp 23.000 \n" +
                        "•  Tofu Fries \n" +
                        "\t\t -> Rp 13.000 \n" +
                        "•  French Fries \n" +
                        "\t\t -> Rp 15.000 \n" +
                        "•  Mineral Water \n" +
                        "\t\t -> Rp 5.000 \n\n" +
                        "Outlet : \n" +
                        "•  Food Court Tunjungan Plaza 1 Lt. 5 \n" +
                        "•  Pakuwon Trade Center Lt. LG \n" +
                        "•  Food Junction Grand Pakuwon \n" +
                        "•  Royal Plaza Lt. 3 \n" +
                        "•  Food Court City of Tomorrow \n" +
                        "•  The Square Siwalankerto, UKP \n" +
                        "•  BG Junction Lt. LL \n" +
                        "•  Pasar Atum Lt. 2 Tahap 1 \n" +
                        "•  East Coast Ground Floor 003 \n" +
                        "•  Kaza Mall Lt. Ground \n\n" +
                        "Note : \n" +
                        "-> Buka: Setiap hari jam sesuai operasional Mall \n\n"
            )
        )
        rvList.add(
            Jajanan(
                R.drawable.dimsum,
                "Dimsum Bondoroso",
                "Dimsum homemade dengan perpaduan citarasa yang pas, bisa untuk anak-anak karena tanpa MSG dan bahan pengawet. Wajib dicoba karena rasanya maknyus !",
                "Menu : \n" +
                        "•  Ayam Wortel \n" +
                        "\t\t -> Rp 2.000 \n" +
                        "•  Ayam Jamur \n" +
                        "\t\t -> Rp 2.500 \n" +
                        "•  Ayam Pedas \n" +
                        "\t\t -> Rp 2.500 \n" +
                        "•  Ayam Udang \n" +
                        "\t\t -> Rp 3.000 \n" +
                        "•  Ayam Mozza \n" +
                        "\t\t -> Rp 3.000 \n" +
                        "•  Ayam Crab \n" +
                        "\t\t -> Rp 3.000 \n" +
                        "•  Ayam Sosis \n" +
                        "\t\t -> Rp 3.000 \n\n" +
                        "Outlet :\n" +
                        "•  Jl. ketintang no 16 A, Wonokromo \n" +
                        "•  Jl. Ketintang No.196, Wonokromo \n" +
                        "•  Jl. Gubeng Kertajaya X-B, No. 6 \n" +
                        "•  Perum ITS, Jl. Teknik Lingkungan \n" +
                        "\t Blok 1 No. 12 \n" +
                        "•  Jl. Kramat Kali No. 32, Wiyung \n\n" +
                        "Note : \n" +
                        "-> Buka: Setiap hari jam 17.00 - 22.30 \n\n"
            )
        )
        rvList.add(
            Jajanan(
                R.drawable.pisang,
                "Sang Pisang",
                "Sang Pisang adalah salah satu bisnis pisang nugget milik Kaesang yang tidak lain adalah putra dari Presiden Jokowi. Pisang nugget Kaesang tidak hanya berdiri di satu tempat saja melainkan Pisang Nugget ini sudah berdiri di beberapa kota besar. Sang Pisang memiliki lapak mulai di toko seperti ruko hingga tenant di mall.",
                "Menu : \n" +
                        "•  Banana Naget\n" +
                        "\t -> Rp 25.000\n" +
                        "•  Banana Roll\n" +
                        "\t -> Rp 25.000\n" +
                        "•  Banana Tortilla\n" +
                        "\t -> Rp 25.000\n" +
                        "•  Pik Kripik\n" +
                        "\t -> Rp 20.000\n" +
                        "•  Ice Banana\n" +
                        "\t -> Rp 15.000\n\n" +
                        "Outlet : \n" +
                        "•  Royal Plaza, Lt. 3\n" +
                        "•  Jl. Raya Tenggilis No. 34 \n" +
                        "•  Jl. Raya Wiguna Tengah \n" +
                        "•  Jl. Manukan Tengah 6 JB \n" +
                        "•  Jl. Raya Darmo Permai 1 No. 36\n\n" +
                        "Note :\n" +
                        "-> Buka: Setiap hari jam 10.00 - \n \t\t 22.00 \n"
            )
        )
        rvList.add(
            Jajanan(
                R.drawable.waffle,
                "Pocoyo Waffle",
                "Pocoyo Waffle & Hotdog merupakan salah satu jajanan dari Singapura yang mempunyai cita rasa khas Singapore. Menu yang disajikan bervariasi seperti aneka pilihan rasa waffle, prata, hot dog dan masih banyak lainnya.",
                "Menu :\n" +
                        "•  Waffle with Sauce Delight\n" +
                        "\t -> (S) : Rp 17.000 – Rp 19.000\n" +
                        "\t -> (R) : Rp 26.000  – Rp 29.000\n" +
                        "•  Waffle with Ice Cream\n" +
                        "\t -> (S) : Rp 20.000  – Rp 26.000\n" +
                        "\t -> (R) : Rp 28.000  – Rp 34.000\n" +
                        "•  Waffle Meat Lover\n" +
                        "\t -> Rp 28.000 – Rp 29.000\n" +
                        "•  Waffle with Ice Cream Delight\n" +
                        "\t -> (S) : Rp 22.000 – Rp 28.000\n" +
                        "\t -> (R) : Rp 30.000 – Rp 38.000 \n\n" +
                        "Outlet :\n" +
                        "•  Foodcourt Tunjungan Plaza 1 Lt. 5\n" +
                        "•  Foodloft Grand City Mall Lt. 4\n" +
                        "•  Pakuwon Trade Center Lt. UG\n" +
                        "•  Marvell City Mall Lt. 3\n" +
                        "•  Galaxy Mall 1 Lt. 2\n" +
                        "•  East Coast Center, City Walk\n\n" +
                        "Note : \n" +
                        "-> Buka: Setiap hari jam sesuai \n \t operasional Mall \n\n"
            )
        )
        rvList.add(
            Jajanan(
                R.drawable.kober,
                "Kober Mie Setan",
                "Kober Mie Setan merupakan pelopor mie pedas pertama di Indonesia yang telah berdiri selama 8 tahun, sejak 2010. Dahulu menu yang ditawarkan hanya berupa varian mie saja, namun sekarang sudah terdapat berbagai varian dimsum dan es juga. Dengan adanya varian makanan pendamping, Mie Kober mendapatkan respon yang positif dari kebanyakan pelanggan.\n" +
                        "Kober Mie Setan, Pedasnya.. NAMPOL !!",
                "Menu : \n" +
                        "•  Varian Mie\n" +
                        "\t -> Rp 12.000 \n" +
                        "•  Varian Dimsum\n" +
                        "\t -> Rp 9.000 \n" +
                        "•  Varian Minum\n" +
                        "\t -> Kecil : Rp 9.500\n" +
                        "\t -> Jumbo : Rp 11.000\n" +
                        "\n" +
                        "Outlet : \n" +
                        "•  Jl. Semolowaru Utara V No. 5 \n" +
                        "\t Buka: Setiap hari jam 12.00 - 23.00\n" +
                        "•  Jl. Khairil Anwar No. 25 \n" +
                        "\t Buka: Setiap hari jam 12.00 - 23.00\n" +
                        "•  Jl. Kaca Piring No. 14 \n" +
                        "\t Buka: Setiap hari jam 12.00 - 23.00\n" +
                        "•  Jl. Sepat Lidah Kulon No. 19 - 21\n" +
                        "\t Buka: Setiap hari jam 12.00 - 23.00 \n\n"
            )
        )
        rvList.add(
            Jajanan(
                R.drawable.aci,
                "Bakso Aci",
                "Bakso seblak adalah salah satu jajanan terkenal yang berasal dari Garut. Teksturnya kenyal karena terbuat dari tepung sagu. Biasanya menggunakan topping ceker ayam, tahu, dan pilus rasa kencur. Untuk penggemar sajian kuah asam pedas, cocok sekali untuk mencoba jajanan ini.",
                "Menu : \n" +
                        "•  Varian Gajih, Puyuh, Keju, Sosis\n" +
                        "\t -> Rp 8.000\n" +
                        "•  Sambel Baby Cumi\n" +
                        "\t -> Rp 20.000\n\n" +
                        "Outlet : \n" +
                        "•  Jl. Tambak Pring Barat No. 15A \n" +
                        "\t Buka: Setiap hari jam 10.00 - 20.00 \n\n"
            )
        )
        rvList.add(
            Jajanan(
                R.drawable.seblak,
                "Seblak Manten",
                "Seblak adalah makanan Indonesia yang dikenal berasal dari Bandung, Jawa Barat yang bercita rasa gurih dan pedas. Terbuat dari kerupuk basah yang dimasak dengan tambahan topping sosis, siomay, pentol, bola ikan, otak-otak ikan, bola udang, dumpling keju, scallop.",
                "Menu : \n" +
                        "•  Level Single (Cabe 0)\n" +
                        "\t -> Rp 18.000\n" +
                        "•  Level PDKT (Cabe 10)\n" +
                        "\t -> Rp 18.000\n" +
                        "•  Level PHP (Cabe 20)\n" +
                        "\t -> Rp 19.000\n" +
                        "•  Level Pacaran (Cabe 30)\n" +
                        "\t -> Rp 20.000\n" +
                        "•  Level Tunangan (Cabe 40)\n" +
                        "\t -> Rp 21.000\n" +
                        "•  Level Manten (Cabe 50)\n" +
                        "\t -> Rp 22.000\n" +
                        "•  Topping : Sosis, Siomay, Pentol, \n \t Bola Ikan, Otak-Otak Ikan, Bola \n \t Udang, Dumpling Keju, Scalop\n" +
                        "\t -> All Topping : Rp 3.500\n\n" +
                        "Outlet : \n" +
                        "•  Grand City Mall, Lt. LG\n" +
                        "\t Buka: Setiap hari jam 10.00 - 22.00\n" +
                        "•  Jl. Ciliwung No. 59\n" +
                        "\t Buka: Setiap hari jam 11.00 - 22.00\n" +
                        "•  Jl. Nginden Semolo No. 20\n" +
                        "\t Buka: Setiap hari jam 10.00 - 22.00\n" +
                        "•  Jl. Gubeng Airlangga II No. 12\n" +
                        "\t Buka: Setiap hari jam 11.00 – 22.00\n" +
                        "•  Jl. BKR Pelajar No. 30, Genteng\n" +
                        "\t Buka: Setiap hari jam 09.00 - 18.00\n" +
                        "•  Jl. Raya Tenggilis Mejoyo Blok AJ \n \t No. 5\n" +
                        "\t Buka: Setiap hari jam 10.00 – 21.00 \n\n"
            )
        )
        rvList.add(
            Jajanan(
                R.drawable.crepes,
                "D'Crepes",
                "Dcrepes menjadi pelopor crepes pertama di Indonesia dan untuk pertama kalinya Dcrepes buka di Plaza Senayan, Jakarta pada tahun 1996 & karena respon pasar yang luar biasa, saat ini kami beroperasi lebih dari 66 outlet & hadir di 10 kota besar di seluruh Indonesia.",
                "Menu : \n" +
                        "•  Sweet Varieties \n" +
                        "\t -> Rp 8.636 - Rp 13.636 \n" +
                        "•  Savory Varieties \n" +
                        "\t -> Rp 11.818 - Rp 12. 727 \n" +
                        "•  Pizza Crepes \n" +
                        "\t -> Rp 11.818 Rp - 12.727 \n" +
                        "•  Ice Cream Crepes \n" +
                        "\t -> Rp 5.455 - Rp 6.000 \n\n" +
                        "Outlet : \n" +
                        "•  Grand City Mall Surabaya \n" +
                        "\t Buka: Setiap hari jam 10.00 - 20.00 \n" +
                        "•  Dcrepes Ruko Petra \n" +
                        "\t Buka: Setiap hari jam 10.00 - 20.00 \n" +
                        "•  Tunjungan Plaza 3 \n" +
                        "\t Buka: Setiap hari jam 11.00 - 21.00 \n" +
                        "•  Ciputra World Surabaya \n" +
                        "\t Buka: Setiap hari jam 11.00 - 21.00 \n" +
                        "•  Pakuwon Mall \n" +
                        "\t Buka: Setiap hari jam 11.00 - 21.00 \n" +
                        "•  Galaxy Mall Surabaya \n" +
                        "\t Buka: Setiap hari jam 11.00 - 21.00 \n" +
                        "•  BG Junction n" +
                        "\t Buka: Setiap hari \n \t jam 10.00 - 21.00 \n\n"
            )
        )
        return rvList
    }
}
