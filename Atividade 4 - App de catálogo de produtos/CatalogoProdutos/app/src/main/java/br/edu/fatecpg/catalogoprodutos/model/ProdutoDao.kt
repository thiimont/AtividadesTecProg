package br.edu.fatecpg.catalogoprodutos.model

interface ProdutoDao {
    fun adicionarProduto(produto: Produto)
    fun listarProdutos(): List<Produto>
}