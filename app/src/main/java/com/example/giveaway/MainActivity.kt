package com.example.giveaway

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.example.giveaway.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener {
            val name = binding.inpName.text.toString()
            if (name.trim().isNotEmpty()) {
                val intent = Intent(this, GiftActivity::class.java).apply {
                    putExtra("name", name)
                }
                startActivity(intent)
            }
        }
    }
}