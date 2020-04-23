package com.tamada.tictactoy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view: View) {
        var selectedButton: Button = view as Button
        var cellId = 0
        when (selectedButton.id) {
            R.id.button1 -> cellId = 1
            R.id.button2 -> cellId = 2
            R.id.button3 -> cellId = 3
            R.id.button4 -> cellId = 4
            R.id.button5 -> cellId = 5
            R.id.button6 -> cellId = 6
            R.id.button7 -> cellId = 7
            R.id.button8 -> cellId = 8
            R.id.button9 -> cellId = 9
        }
        playGame(cellId, selectedButton)
    }

    var activePlayer = 1;
    var payer1 = ArrayList<Int>()
    var payer2 = ArrayList<Int>()

    fun playGame(cellId: Int, selectedButton: Button) {
        if (activePlayer == 1) {
            selectedButton.text = "X"
            activePlayer = 2
            payer1.add(cellId)
        } else {
            selectedButton.text = "0"
            activePlayer = 1
            payer2.add(cellId)
        }
        selectedButton.isEnabled = false
        findWinner()
    }

    private fun findWinner() {
        var winner =-1
        if(payer1.contains(1)&&payer1.contains(2)&&payer1.contains(3)){
           winner=1
        }
        if(payer2.contains(1)&&payer2.contains(2)&&payer2.contains(3)){
           winner=2
        }
        if(payer1.contains(4)&&payer1.contains(5)&&payer1.contains(6)){
           winner=1
        }
        if(payer2.contains(4)&&payer2.contains(5)&&payer2.contains(6)){
           winner=2
        }
        if(payer1.contains(7)&&payer1.contains(8)&&payer1.contains(9)){
           winner=1
        }
        if(payer2.contains(7)&&payer2.contains(8)&&payer2.contains(9)){
           winner=2
        }

        if(payer1.contains(1)&&payer1.contains(4)&&payer1.contains(7)){
           winner=1
        }
        if(payer2.contains(1)&&payer2.contains(4)&&payer2.contains(7)){
           winner=2
        }

        if(payer1.contains(2)&&payer1.contains(5)&&payer1.contains(8)){
            winner=1
        }
        if(payer2.contains(2)&&payer2.contains(5)&&payer2.contains(8)){
            winner=2
        }
        if(payer1.contains(3)&&payer1.contains(6)&&payer1.contains(9)){
            winner=1
        }
        if(payer2.contains(3)&&payer2.contains(6)&&payer2.contains(9)){
            winner=2
        }

        if(winner==1){
          Toast.makeText(this,"player 1 ",Toast.LENGTH_LONG).show()
        }else if(winner==2){
            Toast.makeText(this,"player 2 ",Toast.LENGTH_LONG).show()
        }

    }
}
