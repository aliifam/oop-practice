package com.example.Bangun3D;

public class Tabung {
    private double phi = 22.0 / 7;
    private double r;
    private double tinggi;

    public Tabung(double r, double tinggi){
        this.tinggi = tinggi;
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas(){
        return 2 * getLuas() + 2 * phi * r * tinggi;
    }

    public double getLuasAlas(){
        return phi * r * r;
    }

    public double getVolume() {
        return phi * r * r * tinggi;
    }

    @Override
    public String toString() {
        return "Tabung{r=" + r + " tinggi=" + tinggi + "}"; 
    }
    

}
