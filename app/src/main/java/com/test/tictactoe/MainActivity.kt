package com.test.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var table: IntArray = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
    var player: Boolean = false
    var turn = 0
    var won = false
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button3)
        btn4 = findViewById(R.id.button4)
        btn5 = findViewById(R.id.button5)
        btn6 = findViewById(R.id.button6)
        btn7 = findViewById(R.id.button7)
        btn8 = findViewById(R.id.button8)
        btn9 = findViewById(R.id.button9)

        newGameButton.setOnClickListener {
            turn = 0
            won =false
            btn1.text = ""
            btn2.text = ""
            btn3.text = ""
            btn4.text = ""
            btn5.text = ""
            btn6.text = ""
            btn7.text = ""
            btn8.text = ""
            btn9.text = ""
            btn1.isClickable = true
            btn2.isClickable = true
            btn3.isClickable = true
            btn4.isClickable = true
            btn5.isClickable = true
            btn6.isClickable = true
            btn7.isClickable = true
            btn8.isClickable = true
            btn9.isClickable = true
            table = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
        }
    }

    fun checkHorizontal(num: Int): Boolean {
        return when (num) {
            1 -> {
                table[0] == table[1] && table[1] == table[2]
            }
            2 -> {
                table[3] == table[4] && table[4] == table[5]
            }
            3 -> {
                table[6] == table[7] && table[7] == table[8]
            }
            else -> {
                false
            }
        }
    }

    fun checkVertical(num: Int): Boolean {
        return when (num) {
            1 -> {
                table[0] == table[3] && table[3] == table[6]
            }
            2 -> {
                table[1] == table[4] && table[4] == table[7]
            }
            3 -> {
                table[2] == table[5] && table[5] == table[8]
            }
            else -> {
                false
            }
        }
    }

    fun checkCross(num: Int): Boolean {
        return when (num) {
            1 -> {
                table[0] == table[4] && table[4] == table[8]
            }
            2 -> {
                table[2] == table[4] && table[4] == table[6]
            }
            else -> {
                false
            }
        }
    }

    fun disableAllButton() {
        btn1.isClickable = false
        btn2.isClickable = false
        btn3.isClickable = false
        btn4.isClickable = false
        btn5.isClickable = false
        btn6.isClickable = false
        btn7.isClickable = false
        btn8.isClickable = false
        btn9.isClickable = false
    }

    fun message() {
        won = true
        if (player) {
            Toast.makeText(
                applicationContext,
                "Player O win!!! Please press new game to play again",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            Toast.makeText(
                applicationContext,
                "Player X win!!! Please press new game to play again",
                Toast.LENGTH_SHORT
            ).show()
        }
        disableAllButton()
    }

    fun buttonClick(view: View) {
        val btn = view as Button
        when (btn.id) {
            R.id.button1 -> {
                if (player) {
                    table[0] = 2
                    btn1.text = "x"
                    player = false
                    if (checkHorizontal(1) || checkVertical(1) || checkCross(1)) {
                        message()
                    }
                } else {
                    table[0] = 1
                    btn1.text = "o"
                    player = true
                    if (checkHorizontal(1) || checkVertical(1) || checkCross(1)) {
                        message()
                    }
                }
                btn1.isClickable = false
            }
            R.id.button2 -> {
                if (player) {
                    table[1] = 2
                    btn2.text = "x"
                    player = false
                    if (checkHorizontal(1) || checkVertical(2)) {
                        message()
                    }
                } else {
                    table[1] = 1
                    btn2.text = "o"
                    player = true
                    if (checkHorizontal(1) || checkVertical(2)) {
                        message()
                    }
                }
                btn2.isClickable = false

            }
            R.id.button3 -> {
                if (player) {
                    table[2] = 2
                    btn3.text = "x"
                    player = false
                    if (checkHorizontal(1) || checkVertical(3) || checkCross(2)) {
                        message()
                    }
                } else {
                    table[2] = 1
                    btn3.text = "o"
                    player = true
                    if (checkHorizontal(1) || checkVertical(3) || checkCross(2)) {
                        message()
                    }
                }
                btn3.isClickable = false
            }
            R.id.button4 -> {
                if (player) {
                    table[3] = 2
                    btn4.text = "x"
                    player = false
                    if (checkHorizontal(2) || checkVertical(1)) {
                        message()
                    }
                } else {
                    table[3] = 1
                    btn4.text = "o"
                    player = true
                    if (checkHorizontal(2) || checkVertical(1)) {
                        message()
                    }
                }
                btn4.isClickable = false
            }
            R.id.button5 -> {
                if (player) {
                    table[4] = 2
                    btn5.text = "x"
                    player = false
                    if (checkHorizontal(2) || checkVertical(2) || checkCross(1) || checkCross(2)) {
                        message()
                    }
                } else {
                    table[4] = 1
                    btn5.text = "o"
                    player = true
                    if (checkHorizontal(2) || checkVertical(2) || checkCross(1) || checkCross(2)) {
                        message()
                    }
                }
                btn5.isClickable = false
            }
            R.id.button6 -> {
                if (player) {
                    table[5] = 2
                    btn6.text = "x"
                    player = false
                    if (checkHorizontal(2) || checkVertical(3)) {
                        message()
                    }
                } else {
                    table[5] = 1
                    btn6.text = "o"
                    player = true
                    if (checkHorizontal(2) || checkVertical(3) || checkCross(1)) {
                        message()
                    }
                }
                btn6.isClickable = false
            }
            R.id.button7 -> {
                if (player) {
                    table[6] = 2
                    btn7.text = "x"
                    player = false
                    if (checkHorizontal(3) || checkVertical(1) || checkCross(2)) {
                        message()
                    }
                } else {
                    table[6] = 1
                    btn7.text = "o"
                    player = true
                    if (checkHorizontal(3) || checkVertical(1) || checkCross(2)) {
                        message()
                    }
                }
                btn7.isClickable = false
            }
            R.id.button8 -> {
                if (player) {
                    table[7] = 2
                    btn8.text = "x"
                    player = false
                    if (checkHorizontal(3) || checkVertical(2)) {
                        message()
                    }
                } else {
                    table[7] = 1
                    btn8.text = "o"
                    player = true
                    if (checkHorizontal(3) || checkVertical(2)) {
                        message()
                    }
                }
                btn8.isClickable = false
            }
            R.id.button9 -> {
                if (player) {
                    table[8] = 2
                    btn9.text = "x"
                    player = false
                    if (checkHorizontal(3) || checkVertical(3) || checkCross(1)) {
                        message()
                    }
                } else {
                    table[8] = 1
                    btn9.text = "o"
                    player = true
                    if (checkHorizontal(3) || checkVertical(3) || checkCross(1)) {
                        message()
                    }
                }
                btn9.isClickable = false
            }
        }
        turn++
        if (!won&&turn == 9) {
            Toast.makeText(applicationContext, "It's a draw", Toast.LENGTH_SHORT).show()
        }
    }
}