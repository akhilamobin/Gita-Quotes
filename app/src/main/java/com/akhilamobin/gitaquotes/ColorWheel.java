package com.akhilamobin.gitaquotes;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    private String[] quotes = {"#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    private String color = "";

    public int getColor() {


        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(quotes.length);

        color = quotes[randomNumber];

        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}