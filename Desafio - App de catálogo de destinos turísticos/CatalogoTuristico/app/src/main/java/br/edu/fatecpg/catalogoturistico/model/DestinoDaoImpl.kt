package br.edu.fatecpg.catalogoturistico.model

class DestinoDaoImpl : DestinoDao {
    companion object {
        private val destinos = mutableListOf<Destino>()
    }

    override fun adicionarDestino(destino: Destino) {
        Companion.destinos.add(destino)
    }

    override fun listarDestinos(): List<Destino> {
        return Companion.destinos
    }
}