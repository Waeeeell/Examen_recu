package com.example.examen_recu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NatacioAdapter(private var llistaNatacio: MutableList<Natacio>) : RecyclerView.Adapter<NatacioAdapter.NatacioViewHolder>() {

    class NatacioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvDistancia: TextView = itemView.findViewById(R.id.distancia)
        val tvRitme: TextView = itemView.findViewById(R.id.ritme)
        val tvData: TextView = itemView.findViewById(R.id.data)
        val tvTemps: TextView = itemView.findViewById(R.id.temps)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NatacioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return NatacioViewHolder(view)
    }

    override fun onBindViewHolder(holder: NatacioViewHolder, position: Int) {
        val sessio = llistaNatacio[position]

        holder.tvDistancia.text = sessio.distancia
        holder.tvRitme.text = sessio.ritme
        holder.tvData.text = sessio.data
        holder.tvTemps.text = sessio.hora
    }

    override fun getItemCount(): Int {
        return llistaNatacio.size
    }
}