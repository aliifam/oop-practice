package com.example.Bangun2D;

public class Persegi implements Bangun2D {
    
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getKeliling() {
        return 4*sisi;
    }

    public double getLuas() {
        return sisi*sisi;
    }

    @Override
    public String toString() {
        return "Persegi dengan sisi = " + sisi;
    }
}
