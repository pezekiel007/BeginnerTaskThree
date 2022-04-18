package com.example.beginnertaskthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll : Button = findViewById(R.id.btnRoll)

        roll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val diceOne = Dice(6)
        val diceOneRoll = diceOne.roll()

        val diceTwo = Dice(6)
        val diceTwoRoll = diceTwo.roll()
        
        val diceThree = Dice(6)
        val diceThreeRoll = diceThree.roll()

        val diceOneResult = findViewById<TextView>(R.id.textView)
        val diceTwoResult = findViewById<TextView>(R.id.textView2)
        val diceThreeResult = findViewById<TextView>(R.id.textView3)

        diceOneResult.text = diceOneRoll.toString()
        diceTwoResult.text = diceTwoRoll.toString()
        diceThreeResult.text = diceThreeRoll.toString()

        if (
            (diceOneRoll == 6 && diceTwoRoll == 6) ||
            (diceOneRoll == 6 && diceThreeRoll == 6) ||
            (diceTwoRoll == 6 && diceThreeRoll == 6)
        ) {
            Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
        }

        else if (
                (diceOneRoll + diceTwoRoll == 9) ||
                (diceOneRoll + diceThreeRoll == 9) ||
                (diceTwoRoll + diceThreeRoll == 9)
        ) {
            Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT).show()
        }
    }
}

class Dice(private val sides : Int) {

    fun roll() : Int{
        return (1..sides).random()
    }

}