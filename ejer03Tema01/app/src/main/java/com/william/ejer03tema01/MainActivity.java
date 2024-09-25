package com.william.ejer03tema01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.william.ejer03tema01.controler.HeadsTailsControler;


public class MainActivity extends AppCompatActivity {

    ImageView imgView;
    TextView winnertxt;
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
        imgView = findViewById(R.id.coin_img);
        winnertxt = findViewById(R.id.info_txt);
        Button tailsButton = findViewById(R.id.tails_button);
        Button headsButton = findViewById(R.id.heads_button);
        headsButton.setTag(0);
        tailsButton.setTag(1);

        HeadsTailsControler controler = new HeadsTailsControler(this);

        headsButton.setOnClickListener(controler);
        tailsButton.setOnClickListener(controler);




    }

    /**
     * Muesta la imagen de la cara de la moneda
     */
    public void showHeads(){
        imgView.setImageResource(R.drawable.euro_cara);

    }

    /**
     * Muestra la imagen de la cruz de la moneda
     */
    public void showTails(){
        imgView.setImageResource(R.drawable.euro_cruz);
    }

    /**
     * Muestra el texto en pantalla.
     * @param txt  texto a mostrar
     */
    public void showText(String txt){
        winnertxt.setText(txt);
    }
}