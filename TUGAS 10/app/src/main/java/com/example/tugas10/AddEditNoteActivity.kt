package com.example.tugas10

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_note.*

class AddEditNoteActivity : AppCompatActivity() {
    // untuk memanggil class secara statis
    companion object {
        const val EXTRA_ID = "com.piusanggoro.notesapp.EXTRA_ID"
        const val EXTRA_JUDUL = "com.piusanggoro.notesapp.EXTRA_JUDUL"
        const val EXTRA_KATEGORI = "com.piusanggoro.notesapp.EXTRA_KATEGORI"
        const val EXTRA_INDIKASI = "com.piusanggoro.notesapp.EXTRA_INDIKASI"
        const val EXTRA_STOK = "com.piusanggoro.notesapp.EXTRA_STOK"
    }

    // override untuk mengubah suatu fungsi pada parent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
        number_picker_stock.minValue = 0
        number_picker_stock.maxValue = 100
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_tutup)
        if (intent.hasExtra(EXTRA_ID)) {
            title = "Edit Nama Obat"
            edit_text_title.setText(intent.getStringExtra(EXTRA_JUDUL))
            edit_text_category.setText(intent.getStringExtra(EXTRA_KATEGORI))
            edit_text_indication.setText(intent.getStringExtra(EXTRA_INDIKASI))
            number_picker_stock.value = intent.getIntExtra(EXTRA_STOK, 1)
        } else {
            title = "Tambah Obat"
        }
    }

    // override untuk mengubah suatu fungsi pada parent
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.add_note_menu, menu)
        return true
    }

    // override untuk mengubah suatu fungsi pada parent
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.save_note -> {
                saveNote()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    private fun saveNote() {
        if (edit_text_title.text.toString().trim().isBlank() || edit_text_indication.text.toString().trim().isBlank()) {
            Toast.makeText(this, "Daftar Obat Kosong!", Toast.LENGTH_SHORT).show()
            return
        }
        // deklarasi variabel
        val data = Intent().apply {
            putExtra(EXTRA_JUDUL, edit_text_title.text.toString())
            putExtra(EXTRA_KATEGORI, edit_text_category.text.toString())
            putExtra(EXTRA_INDIKASI, edit_text_indication.text.toString())
            putExtra(EXTRA_STOK, number_picker_stock.value)
            if (intent.getIntExtra(EXTRA_ID, -1) != -1) {
                putExtra(EXTRA_ID, intent.getIntExtra(EXTRA_ID, -1))
            }
        }
        setResult(Activity.RESULT_OK, data)
        finish()
    }
}
