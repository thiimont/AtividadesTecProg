package br.edu.fatecpg.catalogoprodutos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.catalogoprodutos.R
import br.edu.fatecpg.catalogoprodutos.model.Produto
import com.bumptech.glide.Glide

class ProdutoAdapter(private val listaProdutos: List<Produto>) :
    RecyclerView.Adapter<ProdutoAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imgProduto: ImageView = itemView.findViewById(R.id.img_produto)
        private val txtNome: TextView = itemView.findViewById(R.id.txt_nome)
        private val txtPreco: TextView = itemView.findViewById(R.id.txt_preco)

        fun bind(produto: Produto) {
            txtNome.text = produto.nome
            txtPreco.text = "R$ %.2f".format(produto.preco)

            Glide.with(itemView.context)
                .load(produto.imagem)
                .centerCrop()
                .into(imgProduto)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_produto, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(listaProdutos[position])
    }

    override fun getItemCount(): Int = listaProdutos.size
}