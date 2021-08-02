package com.project.cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById<TextView>(R.id.result)


        val button_add = findViewById<Button>(R.id.add)
        val button_minus = findViewById<Button>(R.id.minus)
        val button_divide = findViewById<Button>(R.id.divide)
        val button_multi = findViewById<Button>(R.id.multi)

        button_add.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() + getNum2()).toString()
        })

        button_minus.setOnClickListener(View.OnClickListener {
                view -> result.text = (getNum1() - getNum2()).toString()
        })

        button_divide.setOnClickListener(View.OnClickListener {
                view -> result.text = (getNum1() / getNum2()).toString()
        })

        button_multi.setOnClickListener(View.OnClickListener {
                view -> result.text = (getNum1() * getNum2()).toString()
        })

    }

    fun getNum1(): Int{
        val  num1 = findViewById<EditText>(R.id.num_1)
        return Integer.parseInt(num1.text.toString());
    }

    fun getNum2(): Int{
        val  num2 = findViewById<EditText>(R.id.num_2)
        return Integer.parseInt(num2.text.toString());
    }
}