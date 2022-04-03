package io.travis.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val plusOne = PlusOne()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewNumber = findViewById<TextView>(R.id.textView_number)
        val buttonPlusOne = findViewById<Button>(R.id.button_plusOne)

        val numberListener = View.OnClickListener() {

            val number = textViewNumber.text.toString()
            textViewNumber.text = plusOne.getNumber(number);
        }

        buttonPlusOne.setOnClickListener(numberListener)

    }
}