package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class player_setup extends AppCompatActivity {
    private EditText player1;
    private EditText player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);
        player1 = findViewById(R.id.editTextTextPersonName);
        player2 = findViewById(R.id.editTextTextPersonName2);
    }

    public void submitOnClick(View view) {
        String playerName1 = player1.getText().toString();
        String playerName2 = player2.getText().toString();

        Intent intent = new Intent(this, game_display.class);
        intent.putExtra("PLAYER_NAMES",new String[] {playerName1,playerName2});
        startActivity(intent);
    }

}