package com.william.ejer04tema01.controler;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Toast;

import com.william.ejer04tema01.MainActivity;
import com.william.ejer04tema01.R;
import com.william.ejer04tema01.model.GameModel;

public class GameControler implements View.OnClickListener {

    private  MainActivity main;
    private GameModel model;

    public  GameControler(MainActivity main, GameModel model){
        this.main = main;
        this.model = model;
    }
    @Override
    public void onClick(View view) {
        int playerDesition = (int) view.getTag();
        int result = model.play(playerDesition);

        int npcDesition = model.getNpcDesition();


        if (playerDesition == model.ROCK)
            main.setPlayerImg(R.drawable.piedra);
        else if(playerDesition == model.PAPPER)
            main.setPlayerImg(R.drawable.papel);
        else if(playerDesition == model.SISSORS)
            main.setPlayerImg(R.drawable.tijera);
        else if(playerDesition == model.LIZARD)
            main.setPlayerImg(R.drawable.lagarto);
        else if (playerDesition == model.SPOCK)
            main.setPlayerImg(R.drawable.spoke);
        else
            main.setPlayerImg(R.drawable.interrogantes);

        if (npcDesition == model.ROCK)
            main.setNpcImg(R.drawable.piedra);
        else if(npcDesition == model.PAPPER)
            main.setNpcImg(R.drawable.papel);
        else if(npcDesition == model.SISSORS)
            main.setNpcImg(R.drawable.tijera);
        else if(npcDesition == model.LIZARD)
            main.setNpcImg(R.drawable.lagarto);
        else if (npcDesition == model.SPOCK)
            main.setNpcImg(R.drawable.spoke);
        else
            main.setNpcImg(R.drawable.interrogantes);
    }
}
