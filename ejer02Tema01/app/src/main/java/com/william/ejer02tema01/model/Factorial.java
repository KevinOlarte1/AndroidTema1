package com.william.ejer02tema01.model;

import android.util.Log;
import android.widget.Toast;

import com.william.ejer02tema01.MainActivity;

public class Factorial {

    public static long calculate(int num){

        long numf = 1;
        for (int i = 1; i <= num ; i++) {
            numf *= i;
        }

        return numf;
    }
}
