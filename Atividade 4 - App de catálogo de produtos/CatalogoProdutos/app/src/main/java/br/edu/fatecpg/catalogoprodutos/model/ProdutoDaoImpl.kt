package br.edu.fatecpg.catalogoprodutos.model

class ProdutoDaoImpl : ProdutoDao {
    companion object {
        private val produtos = mutableListOf<Produto>()
    }

    override fun adicionarProduto(produto: Produto) {
        Companion.produtos.add(produto)
    }

    override fun listarProdutos(): List<Produto> {
        return Companion.produtos
    }
}