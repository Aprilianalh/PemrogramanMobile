package com.example.tugas10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas10.catatan.Note
import kotlinx.android.synthetic.main.note_item.view.*

class NoteAdapter : ListAdapter<Note, NoteAdapter.NoteHolder>(DIFF_CALLBACK) {
    // untuk memanggil class secara statis
    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Note>() {
            override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
                return oldItem.id == newItem.id
            }
            override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
                return oldItem.title == newItem.title && oldItem.indication == newItem.indication
                        && oldItem.category == newItem.category && oldItem.stock == newItem.stock
            }
        }
    }
    private var listener: OnItemClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false)
        return NoteHolder(itemView)
    }

    // override untuk mengubah suatu fungsi pada parent
    override fun onBindViewHolder(holder: NoteHolder, position: Int) {
        val currentNote: Note = getItem(position)
        holder.textViewTitle.text = currentNote.title
        holder.textViewPriority.text = currentNote.stock.toString()
        holder.textViewIndication.text = currentNote.indication
        holder.textViewCategory.text = currentNote.category
    }
    fun getNoteAt(position: Int): Note {
        return getItem(position)
    }
    inner class NoteHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                // deklarasi variabel
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    listener?.onItemClick(getItem(position))
                }
            }
        }
        var textViewTitle: TextView = itemView.text_view_title
        var textViewPriority: TextView = itemView.text_view_stock
        var textViewIndication: TextView = itemView.text_view_indication
        var textViewCategory: TextView = itemView.text_view_category
    }
    interface OnItemClickListener {
        fun onItemClick(note: Note)
    }
    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }
}
