package br.edu.fatecpg.catalogoturistico.model

interface DestinoDao {
    fun adicionarDestino(destino: Destino)
    fun listarDestinos(): List<Destino>
}