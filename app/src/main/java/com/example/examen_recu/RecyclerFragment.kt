package com.example.examen_recu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NatacioAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recycler, container, false)

        recyclerView = view.findViewById(R.id.rvprincipal)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val dades = mutableListOf(
            Natacio(1, "1.000 m", "2'06 /100 m", "28/2 9:07", "01:23:05"),
            Natacio(2, "4.000 m", "2'04 /100 m", "26/2 8:49", "01:22:22"),
            Natacio(3, "4.000 m", "2'05 /100 m", "23/2 8:26", "01:23:18"),
            Natacio(4, "4.000 m", "2'06 /100 m", "20/2 8:24", "01:24:08"),
            Natacio(5, "2.000 m", "2'05 /100 m", "14/2 15:53", "01:23:06")
        )

        adapter = NatacioAdapter(dades)
        recyclerView.adapter = adapter

        return view
    }
}