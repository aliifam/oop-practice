package com.example.Bangun3D;

public class Kerucut extends Tabung {

    private double phi = 22.0 / 7;

    public Kerucut(double r, double tinggi) {
        super(r, tinggi);
        //TODO Auto-generated constructor stub
    }
    
    public double getSisiMiring(){
        double s = getR() * getR() + getTinggi() * getTinggi();
        return Math.sqrt(s);
    }

    public double getLuas(){
        return getLuasAlas() + phi * getR() * getSisiMiring();
    }

    public double getVolume() {
        return super.getVolume() / 3;
    }

    @Override
    public String toString() {
        return "Kerucut{r=" + getR() + " tinggi=" + getTinggi() + "}"; 
    }
}
