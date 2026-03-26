package br.edu.fatecpg.catalogoturistico.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.catalogoturistico.R
import br.edu.fatecpg.catalogoturistico.adapter.DestinoAdapter
import br.edu.fatecpg.catalogoturistico.model.DestinoDaoImpl

class ListaActivity : AppCompatActivity(R.layout.activity_lista) {
    private val destinoDao = DestinoDaoImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rvListaDestino = findViewById<RecyclerView>(R.id.rv_lista_destino)
        val destinos = destinoDao.listarDestinos()

        rvListaDestino.layoutManager = LinearLayoutManager(this)
        rvListaDestino.adapter = DestinoAdapter(destinos as MutableList)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}