package com.example;

public class Matematika {
    
    public static final double phi = 3.14;

    public static double getMiring(double a, double b){
        double miring = a * a + b * b;
        return Math.sqrt(miring);
    }

    public static double getLurus(double miring, double a){
        double b = miring * miring - a * a;
        return Math.sqrt(b);
    }
}
