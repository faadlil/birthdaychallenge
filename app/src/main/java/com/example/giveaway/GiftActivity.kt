package com.example.giveaway

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.giveaway.databinding.ActivityGiftBinding
import java.util.*

class GiftActivity : AppCompatActivity() {

    private val data: Map<String, String> = mapOf(
        "mucha" to "18 Maret 1997",
        "fadil" to " 17 Maret 1998",
        "faadlil" to "16 Maret 1999"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityGiftBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengambil data intent
        val name = intent.getStringExtra("name") ?: ""

        val gift = data[name.toLowerCase(Locale.getDefault()).trim()]

        binding.viewName.text = name

        if (gift != null) {
            binding.lahir.text = gift
        }else{
            binding.lahir.text = "Wish U All The Best"
        }

        binding.viewName.animate().setDuration(10_000).alpha(1F)
        binding.lahir.animate().setDuration(14_000).alpha(1F)
    }
}