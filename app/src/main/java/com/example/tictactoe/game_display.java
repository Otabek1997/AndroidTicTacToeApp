package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class game_display extends AppCompatActivity {
    private TicTacToeBoard ticTacToeBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_display);

        Button playAgainButton = findViewById(R.id.playAgain);
        Button homeBtn = findViewById(R.id.homeBTN);
        TextView playerTurn = findViewById(R.id.playerTurn);
        String[] playerNames = getIntent().getStringArrayExtra("PLAYER_NAMES");



        playAgainButton.setVisibility(View.GONE);
        homeBtn.setVisibility(View.GONE);

        if (playerNames != null) {
            playerTurn.setText((playerNames[0] + "'s Turn"));
        }

        ticTacToeBoard = findViewById(R.id.ticTacToeBoard);
        ticTacToeBoard.setUpGame(playAgainButton, homeBtn, playerTurn, playerNames);

    }

    public void playAgainOnClick(View view) {
        ticTacToeBoard.resetGame();
        ticTacToeBoard.invalidate();

    }

    public void homeOnClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
