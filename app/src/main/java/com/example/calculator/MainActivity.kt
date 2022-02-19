package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.util.Log
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        var finalNumber1 : String
        var finalNumber2 : String
        val number_onGoing = tasarim.editTextNumbers.text



        tasarim.buttonOne.setOnClickListener {
            val number_onGoing = tasarim.editTextNumbers.text
            tasarim.editTextNumbers.setText("$number_onGoing"+"1")
        }
        tasarim.buttonTwo.setOnClickListener {
            val number_onGoing = tasarim.editTextNumbers.text
            tasarim.editTextNumbers.setText("$number_onGoing"+"2")
        }
        tasarim.buttonThree.setOnClickListener {
            val number_onGoing = tasarim.editTextNumbers.text
            tasarim.editTextNumbers.setText("$number_onGoing"+"3")
        }
        tasarim.buttonFour.setOnClickListener {
            val number_onGoing = tasarim.editTextNumbers.text
            tasarim.editTextNumbers.setText("$number_onGoing" +"4")
        }
        tasarim.buttonFive.setOnClickListener {
            val number_onGoing = tasarim.editTextNumbers.text
            tasarim.editTextNumbers.setText("$number_onGoing"+"5")
        }
        tasarim.buttonSix.setOnClickListener {
            val number_onGoing = tasarim.editTextNumbers.text
            tasarim.editTextNumbers.setText("$number_onGoing"+"6")
        }
        tasarim.buttonSeven.setOnClickListener {
            val number_onGoing = tasarim.editTextNumbers.text
            tasarim.editTextNumbers.setText("$number_onGoing"+"7")
        }
        tasarim.buttonEight.setOnClickListener {
            val number_onGoing = tasarim.editTextNumbers.text
            tasarim.editTextNumbers.setText("$number_onGoing"+"8")
        }
        tasarim.buttonNine.setOnClickListener {
            val number_onGoing = tasarim.editTextNumbers.text
            tasarim.editTextNumbers.setText("$number_onGoing"+"9")
        }
        tasarim.buttonZero.setOnClickListener {
           if(tasarim.editTextNumbers.text.isBlank()){
               Snackbar.make(it,"Number can not starts with 0.",Snackbar.LENGTH_SHORT).show()
           }else {

               val number_onGoing = tasarim.editTextNumbers.text
               tasarim.editTextNumbers.setText("$number_onGoing" + "0")
           }
        }
        tasarim.buttonAC.setOnClickListener {
            clearCache(number_onGoing)
            tasarim.cache.text= null
            tasarim.editTextNumbers.text = null
            tasarim.textViewResult.text = null
        }

        tasarim.buttonPlus.setOnClickListener {
            tasarim.cache.text = tasarim.editTextNumbers.text.toString()
            if(tasarim.cache.text.isNullOrBlank()){
                Snackbar.make(it,"You should enter a number first.",Snackbar.LENGTH_SHORT).show()
            }else {
                tasarim.editTextNumbers.text = null
                tasarim.editTextNumbers.hint = ""
            }

        }
        tasarim.buttonCalculate.setOnClickListener {
            if(tasarim.cache.text.isNullOrEmpty() || tasarim.editTextNumbers.text.isNullOrEmpty() ){
                Snackbar.make(it,"You should enter a number first.",Snackbar.LENGTH_SHORT).show()
            }else {
                finalNumber1 = tasarim.cache.text.toString()
                finalNumber2 = tasarim.editTextNumbers.text.toString()
                val toplamInt = finalNumber1.toInt() + finalNumber2.toInt()
                val toplamString = toplamInt.toString()
                tasarim.textViewResult.setText(toplamString)
                tasarim.editTextNumbers.setText(null)
            }
        }


    }


    fun clearCache(number1: Editable, ){
        val number1 = null
    }




}