package com.example.mad_prac3_20012011107

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.mad_prac3_20012011107.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

//        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_login
//        binding.bottomNavigationView.setOnItemSelectedListener { it1 ->
//            when(it1.itemId){
//                R.id.bottom_nav_reg->
//                {
//                    Intent(this, RegistrationActivity::class.java).also { startActivity(it) }
//                }
//              return@setOnItemSelectedListener true
//            }
        }
    }