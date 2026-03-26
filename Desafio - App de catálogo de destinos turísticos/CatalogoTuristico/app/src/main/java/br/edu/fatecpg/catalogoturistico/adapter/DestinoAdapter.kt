package br.edu.fatecpg.catalogoturistico.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.catalogoturistico.R
import br.edu.fatecpg.catalogoturistico.model.Destino
import br.edu.fatecpg.catalogoturistico.view.WebViewActivity

class DestinoAdapter(private val destinos: MutableList<Destino>) :
    RecyclerView.Adapter<DestinoAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txvNomeDestino = itemView.findViewById<TextView>(R.id.txv_nome_destino)
        val txvPaisOuRegiao = itemView.findViewById<TextView>(R.id.txv_pais_regiao)
        val txvUrlReferencia = itemView.findViewById<TextView>(R.id.txv_url_referencia)

        val btnExplorar = itemView.findViewById<Button>(R.id.btn_explorar)
        val btnExcluir = itemView.findViewById<Button>(R.id.btn_excluir)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_destino, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return destinos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val destino = destinos[position]
        val context = holder.itemView.context

        holder.txvNomeDestino.text =
            context.getString(R.string.nome_do_destino_format, destino.nomeDestino)
        holder.txvPaisOuRegiao.text =
            context.getString(R.string.pais_regiao_format, destino.paisOuRegiao)
        holder.txvUrlReferencia.text =
            context.getString(R.string.url_de_referencia_format, destino.urlReferencia)

        holder.btnExplorar.setOnClickListener {
            val intent = Intent(context, WebViewActivity::class.java)
            intent.putExtra("urlDestino", destino.urlReferencia)
            context.startActivity(intent)
        }

        holder.btnExcluir.setOnClickListener {
            destinos.removeAt(position)
            notifyItemRemoved(position)
        }
    }

}