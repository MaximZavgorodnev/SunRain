package ru.maxpek.sunrain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.maxpek.sunrain.databinding.AppActivityBinding


class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = AppActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}