package com.example.erkinbekovbilimmonth_5_dz_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.erkinbekovbilimmonth_5_dz_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        calculate()
    }

    private fun calculate() {
        binding.apply {
            btnCalc.setOnClickListener {
                tvResult.text = Math().add(firstNum.text.toString(), secondNum.text.toString())
            }
            btnCalcDiv.setOnClickListener {
                tvResult.text = Math().divide(firstNum.text.toString(), secondNum.text.toString())
            }
        }
    }
}