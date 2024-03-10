package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG).show()
            val from = binding.slider.values[0]
            val to = binding.slider.values[1]
            if (binding.checkbox.isChecked) {
                val randomnumber = Random.nextInt(from.toInt(), to.toInt())
                binding.resultTV.text = "Generated Number:$randomnumber"
            } else {
                val randomnumber = Random.nextDouble(from.toDouble(), to.toDouble())
                binding.resultTV.text = String.format("Generated Number: %.3f", randomnumber)
            }
        }
    }

}