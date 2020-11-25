package com.example.praktikum8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders

class fragmentthird : Fragment() {
    // TODO: Rename and change types of parameters
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null

    // override untuk mengubah suatu fungsi pada parent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.
            of(requireActivity()).   get(CommunicationViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?     ): View? {
        return inflater.inflate(R.layout.fragment_third,
            container, false)     }

    // untuk memanggil class secara statis
    companion object {

        fun newInstance(): fragmentthird{
            return fragmentthird()         }
    }
}
