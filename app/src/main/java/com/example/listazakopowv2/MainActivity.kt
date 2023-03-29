package com.example.listazakopowv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var RadioTrybListy = findViewById<RadioButton>(R.id.radioButtonTrybListy)
        var RadioTrybDodawania = findViewById<RadioButton>(R.id.radioButtonTrybDodawania)

        var Warzywa = findViewById<TextView>(R.id.Warzywa)
        var Wedliny = findViewById<TextView>(R.id.Wedliny)
        var Pieczywo = findViewById<TextView>(R.id.Pieczywo)

        RadioTrybDodawania.setChecked(true)


        RadioTrybListy.setOnClickListener {
            Warzywa.visibility = View.INVISIBLE
            Wedliny.visibility = View.INVISIBLE
            Pieczywo.visibility = View.INVISIBLE
        }

        RadioTrybDodawania.setOnClickListener {
            Warzywa.visibility = View.VISIBLE
            Wedliny.visibility = View.VISIBLE
            Pieczywo.visibility = View.VISIBLE
        }
    }
}