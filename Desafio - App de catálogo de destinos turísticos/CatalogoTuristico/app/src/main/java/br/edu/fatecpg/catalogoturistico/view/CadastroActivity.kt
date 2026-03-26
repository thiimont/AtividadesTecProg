package br.edu.fatecpg.catalogoturistico.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.catalogoturistico.R
import br.edu.fatecpg.catalogoturistico.model.Destino
import br.edu.fatecpg.catalogoturistico.model.DestinoDaoImpl

class CadastroActivity : AppCompatActivity(R.layout.activity_cadastro) {
    private val destinoDao = DestinoDaoImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val edtNomeDestino = findViewById<EditText>(R.id.edt_nome_destino)
        val edtPaisRegiao = findViewById<EditText>(R.id.edt_pais_regiao)
        val edtUrlReferencia = findViewById<EditText>(R.id.edt_url_referencia)

        val btnSalvar = findViewById<Button>(R.id.btn_salvar_cadastro)
        val txvExibirLista = findViewById<TextView>(R.id.txv_exibir_lista)

        btnSalvar.setOnClickListener {
            val nomeDestino = edtNomeDestino.text.toString()
            val paisOuRegiao = edtPaisRegiao.text.toString()
            val urlReferencia = edtUrlReferencia.text.toString()

            if (nomeDestino.isBlank()) {
                edtNomeDestino.error = "O nome do destino é obrigatório."

            } else if (paisOuRegiao.isBlank()) {
                edtPaisRegiao.error = "O pais/região é obrigatório."

            } else if (urlReferencia.isBlank()) {
                edtUrlReferencia.error = "A URL é obrigatória."

            } else {
                val destino = Destino(nomeDestino, paisOuRegiao, urlReferencia)
                destinoDao.adicionarDestino(destino)

                edtNomeDestino.text.clear()
                edtPaisRegiao.text.clear()
                edtUrlReferencia.text.clear()

                Toast.makeText(this, "Destino cadastrado com sucesso!", Toast.LENGTH_SHORT).show()
            }
        }

        txvExibirLista.setOnClickListener {
            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}