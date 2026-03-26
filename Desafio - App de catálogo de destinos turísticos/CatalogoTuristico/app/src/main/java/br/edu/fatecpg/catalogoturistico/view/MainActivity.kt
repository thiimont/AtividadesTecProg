package br.edu.fatecpg.catalogoturistico.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.catalogoturistico.R

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val edtUsuario = findViewById<EditText>(R.id.edt_usuario)
        val edtSenha = findViewById<EditText>(R.id.edt_senha)
        val btnLogin = findViewById<Button>(R.id.btn_login)
        val txvLinkCadastro = findViewById<TextView>(R.id.txv_link_cadastro)

        val usuarioCorreto: String = "Thiago"
        val senhaCorreta: String = "123456"

        btnLogin.setOnClickListener {
            if (edtUsuario.text.toString().equals(usuarioCorreto) && edtSenha.text.toString()
                    .equals(senhaCorreta)
            ) {
                val intent = Intent(this, CadastroActivity::class.java)
                startActivity(intent)
            } else {
                edtUsuario.text.clear()
                edtSenha.text.clear()

                edtUsuario.error = "Usuário e/ou senha inválidos."
                edtSenha.error = "Usuário e/ou senha inválidos."
            }
        }

        txvLinkCadastro.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
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