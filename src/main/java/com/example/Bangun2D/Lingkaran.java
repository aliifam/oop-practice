package com.example.Bangun2D;

import com.example.Matematika;

public class Lingkaran implements Bangun2D {
    
    // private double phi = 3.14;
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getKeliling() {
        return 2*Matematika.phi*r;
    }

    public double getLuas() {
        return Matematika.phi*(r*r);
    }

    @Override
    public String toString() {
        return "lingkaran dgn jari2 = " + getR();
    }
    
}
