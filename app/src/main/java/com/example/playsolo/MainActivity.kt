package com.example.playsolo

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val players = arrayOf (
        "Choose Player",
        "Aunt Loopers",
        "Aunt Kim",
        "Bot",
        "David",
        "Grandma",
        "Grandpa",
        "Jessica",
        "Morgan",
        "Susan",
        "Uncle Bill")
    val hands = arrayOf (
        "Small Froke",
        "Big Froke",
        "Small Wedding",
        "Club Wedding",
        "Small Solo",
        "Club Solo",
        "Small Froke - through",
        "Big Froke - through",
        "Small Wedding - through",
        "Club Wedding - through",
        "Small Solo - through",
        "Club Solo - through",
        "Small Froke - DO",
        "Club Froke - DO",
        "Small Wedding - DO",
        "Club Wedding - DO",
        "Small Solo - DO",
        "Club Solo - DO"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addScores()
        selectPlayer1()
        selectPlayer2()
        selectPlayer3()
        selectPlayer4()
        selectHandPlayed()



    }

    private fun selectPlayer1() {
        val playerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, players)
        spinner_player1.adapter = playerAdapter
        check_box_player1.text = spinner_player1.selectedItem?.toString()
    }

    private fun selectPlayer2() {
        val playerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, players)
        spinner_player2.adapter = playerAdapter
    }

    private fun selectPlayer3() {
        val playerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, players)
        spinner_player3.adapter = playerAdapter
    }

    private fun selectPlayer4() {
        val playerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, players)
        spinner_player4.adapter = playerAdapter
    }

    private fun addScores() {
        button_add_scores.setOnClickListener {

        }
    }

    private fun selectHandPlayed() {
        val handAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, hands)
        spinner_hand_played.adapter = handAdapter
        check_box_player1.text = spinner_player1.selectedItem?.toString()
    }

}