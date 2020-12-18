package com.example.praktikum11.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.praktikum11.R
import com.example.praktikum11.model.Photo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list.view.*

class PhotoListAdapter(private var photos: ArrayList<Photo>) : RecyclerView.Adapter<PhotoListAdapter.ViewHolder>() {
    fun updatePhotos(newPhotos: List<Photo>) {
        photos.clear()
        photos.addAll(newPhotos)
        notifyDataSetChanged()
    }

    // override untuk mengubah suatu fungsi pada parent
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    override fun getItemCount() = photos.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(photos[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(photos: Photo) {
            itemView.tvTitle.text = photos.title
            //itemView.body.text = photos.body
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "Hello", Toast.LENGTH_LONG).show()
            }
            //Glide.with(itemView.context). load(photos.thumbnail).into(itemView.imageView)
            Picasso.get().load(photos.thumbnail).into(itemView.imageView)
        }
    }
}