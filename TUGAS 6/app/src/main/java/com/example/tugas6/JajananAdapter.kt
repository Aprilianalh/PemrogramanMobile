package com.example.tugas6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas6.Jajanan
import kotlinx.android.synthetic.main.list_jajanan.view.*
class JajananAdapter (private val itemFac: List<Jajanan>, private val clickListener: (Jajanan) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_jajanan, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFac[position], clickListener)
    }

    override fun getItemCount() = itemFac.size
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: Jajanan, clickListener: (Jajanan) -> Unit) {
            itemView.foto_jajan.setImageResource(data.pict)
            itemView.nama_jajan.text = data.name
            itemView.setOnClickListener {
                clickListener(data) }
        }
    }
}
