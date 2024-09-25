package com.william.ejer04tema01;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.william.ejer04tema01.controler.GameControler;
import com.william.ejer04tema01.model.GameModel;

public class MainActivity extends AppCompatActivity {

    ImageView playerimg;
    ImageView npcimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button rockButton = findViewById(R.id.rock_button);
        Button paperButton = findViewById(R.id.paper_button);
        Button scissorsButton = findViewById(R.id.scissors_button);
        Button lizardButton = findViewById(R.id.lizard_button);
        Button spockButton = findViewById(R.id.spock_button);

        playerimg = findViewById(R.id.player_img);
        npcimg = findViewById(R.id.enemy_img);

        rockButton.setTag(0);
        paperButton.setTag(1);
        scissorsButton.setTag(2);
        lizardButton.setTag(3);
        spockButton.setTag(4);

        GameModel game = new GameModel();
        GameControler controler = new GameControler(this, game);

        rockButton.setOnClickListener(controler);
        paperButton.setOnClickListener(controler);
        scissorsButton.setOnClickListener(controler);
        lizardButton.setOnClickListener(controler);
        spockButton.setOnClickListener(controler);
    }

    public void setPlayerImg(int drw){
        this.playerimg.setImageResource(drw);
    }
    public void setNpcImg(int drw){
        this.npcimg.setImageResource(drw);
    }



}