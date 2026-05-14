package com.thiishy.movlist.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.thiishy.movlist.R
import com.thiishy.movlist.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.btnLogin.setOnClickListener {
            val emailUsuario = binding.edtEmailUsuario.text.toString()
            val senhaUsuario = binding.edtSenhaUsuario.text.toString()

            auth.signInWithEmailAndPassword(emailUsuario, senhaUsuario)
                .addOnCompleteListener(this) { task ->
                    if(task.isSuccessful) {
                        Toast.makeText(this, "Login realizado com sucesso.", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, RegistroActivity::class.java)
                        startActivity(intent)
                    } else {
                        listOf(
                            binding.edtEmailUsuario,
                            binding.edtSenhaUsuario
                        ).forEach { it.text.clear()
                                    it.error = "Usuário e/ou senha incorretos." }

                    }
                }
        }
    }
}