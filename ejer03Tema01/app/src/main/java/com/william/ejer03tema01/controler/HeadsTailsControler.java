package com.william.ejer03tema01.controler;

import android.view.View;
import android.widget.Toast;

import com.william.ejer03tema01.MainActivity;
import com.william.ejer03tema01.R;

import java.util.Random;

public class HeadsTailsControler implements View.OnClickListener {
    private MainActivity main;
    private Random rnd;

    public  HeadsTailsControler(MainActivity main){
        this.main = main;
        this.rnd = new Random();
    }
    @Override
    public void onClick(View view) {
        int numSelected = (int) view.getTag();

        int numRandom = rnd.nextInt(2);

        if (numRandom == 0)
            main.showHeads();
        else
            main.showTails();

        if (numSelected == numRandom){
            main.showText(String.valueOf(R.string.winner));
        }
        else {
            main.showText(String.valueOf(R.string.Losser));
        }

    }
}
