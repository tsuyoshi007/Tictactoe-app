package com.test.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var table: BooleanArray = booleanArrayOf(false, false, false, false, false, false, false, false, false)
    var player: Boolean = false
    val btn1 = findViewById<Button>(R.id.button1)
    val btn2 = findViewById<Button>(R.id.button2)
    val btn3 = findViewById<Button>(R.id.button3)
    val btn4 = findViewById<Button>(R.id.button4)
    val btn5 = findViewById<Button>(R.id.button5)
    val btn6 = findViewById<Button>(R.id.button6)
    val btn7 = findViewById<Button>(R.id.button7)
    val btn8 = findViewById<Button>(R.id.button8)
    val btn9 = findViewById<Button>(R.id.button9)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newGameButton.setOnClickListener {
            btn1.text = ""
            btn2.text = ""
            btn3.text = ""
            btn4.text = ""
            btn5.text = ""
            btn6.text = ""
            btn7.text = ""
            btn8.text = ""
            btn9.text = ""
        }
    }

    fun buttonClick(view: View) {
        val btn = view as Button

        when (btn.id) {
            R.id.button1 -> {
                if (player && !table[0]) {
                    btn1.text = "x"
                    player = false
                } else {
                    btn1.text = "o"
                    player = true
                }
                table[0] = true
            }
            R.id.button2 -> {
                if (player) {
                    btn2.text = "x"
                    player = false
                } else {
                    btn2.text = "o"
                    player = true
                }
                table[1] = true
            }
            R.id.button3 -> {
                if (player) {
                    btn3.text = "x"
                    player = false
                } else {
                    btn3.text = "o"
                    player = true
                }
                table[2] = true
            }
            R.id.button4 -> {
                if (player) {
                    btn4.text = "x"
                    player = false
                } else {
                    btn4.text = "o"
                    player = true
                }
                table[3] = true
            }
            R.id.button5 -> {
                if (player) {
                    btn5.text = "x"
                    player = false
                } else {
                    btn5.text = "o"
                    player = true
                }
                table[4] = true
            }
            R.id.button6 -> {
                if (player) {
                    btn6.text = "x"
                    player = false
                } else {
                    btn6.text = "o"
                    player = true
                }
                table[5] = true
            }
            R.id.button7 -> {
                if (player) {
                    btn7.text = "x"
                    player = false
                } else {
                    btn7.text = "o"
                    player = true
                }
                table[6] = true
            }
            R.id.button8 -> {
                if (player) {
                    btn8.text = "x"
                    player = false
                } else {
                    btn8.text = "o"
                    player = true
                }
                table[7] = true
            }
            R.id.button9 -> {
                if (player) {
                    btn9.text = "x"
                    player = false
                } else {
                    btn9.text = "o"
                    player = true
                }
                table[8] = true
            }
        }
    }
}
