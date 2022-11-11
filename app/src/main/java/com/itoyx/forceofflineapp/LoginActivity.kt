package com.itoyx.forceofflineapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.itoyx.forceofflineapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var activityLoginBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(activityLoginBinding.root)

        activityLoginBinding.apply {
            login.setOnClickListener {
                val account = accountEdit.text.toString()
                val psw = passwordEdit.text.toString()
                if(account == "admin" && psw == "123456") {
                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this@LoginActivity,
                        "Account or Password is INVALID", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}