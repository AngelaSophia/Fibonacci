package com.example.recyclernumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger
import kotlin.math.max

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rvnumber = findViewById<RecyclerView>(R.id.rvNumbers)
        rvnumber.layoutManager = LinearLayoutManager(baseContext,)
        var numberAdapter = NumberrvAdapter((fibonacci(100)))
        rvnumber.adapter = numberAdapter
        fibonacci(10)
    }

    fun fibonacci(maxNumber: Int):MutableList<BigInteger> {
        var count = 0;
        var firstNumber = 0.toBigInteger()
        var secondNumber = 1.toBigInteger()
        var fibNumber = mutableListOf<BigInteger>()
        while (count <= maxNumber) {
            print(firstNumber)
            var sum = firstNumber + secondNumber
            firstNumber = secondNumber
            secondNumber = sum
            count++
            fibNumber.add(firstNumber)
        }
        return fibNumber

    }
}




