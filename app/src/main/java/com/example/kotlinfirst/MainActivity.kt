package com.example.kotlinfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = 10;// val is used for immutable value
        val result = if (num1 > 0) {
            "num is positive"// here we are using (if-else if-else) condition
        } else if (num1 < 0) {
            "num is negative"
        } else {
            "num is zero"
        }
        println(result)//printing final result after checking all above conditions
        println(num1)// printing declared variable's value.
    }
}
