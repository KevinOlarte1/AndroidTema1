package com.william.ejer04tema01.model;

import android.widget.Toast;

import java.util.Random;

public class GameModel {
    public static final int ROCK = 0;
    public static final int PAPPER = 1;
    public static final int SISSORS = 2;
    public static final int LIZARD = 3;
    public static final int SPOCK = 4;

    private static final int LAST_LOSE = 2;


    private Random rnd;
    private int npcDesition;

    public GameModel(){
        this.rnd = new Random();
        this.npcDesition = 0;
    }


    private static final int[][]STATES ={
            {ROCK,PAPPER,SPOCK,SISSORS,LIZARD},
            {PAPPER,SISSORS,LIZARD,ROCK,SPOCK},
            {SISSORS,ROCK,SPOCK,LIZARD,PAPPER},
            {LIZARD,SISSORS,ROCK,SPOCK,PAPPER},
            {SPOCK,PAPPER,LIZARD,SISSORS,ROCK}
    };

    private static final int SIZE = STATES.length;

    /**
     * Metodo para jugar al juego.
     * @param playerDesition decision del player piedra/papel/tijeras.... de forma numerica
     * @return -2 : Valor fuera de rango || 0 : Empate || 1 : Ganaste || -1 : Perdiste
     */
    public int play(int playerDesition){
        if (playerDesition < 0 || playerDesition >= SIZE)
            return -2;
        this.npcDesition = rnd.nextInt(SIZE);
        for(int i = 0; i < STATES[playerDesition].length ; i++) {
            if (STATES[playerDesition][i] == npcDesition)
            {
                if (i == 0){
                    return 0;
                }
                else if (i <= LAST_LOSE){
                    //Pierde Jugador
                    return -1;
                }
                else{
                    return 1;
                }
            }

        }
        return -2;
    }

    public int getNpcDesition() {
        return npcDesition;
    }
}
