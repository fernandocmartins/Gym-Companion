package com.fernando.gymcompanion.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fernando.gymcompanion.R
import com.fernando.gymcompanion.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding: ActivityLoginBinding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}