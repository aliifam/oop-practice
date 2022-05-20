package com.example.Bangun2D;

public abstract class Segitiga implements Bangun2D {
    
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return this.alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public abstract double getKeliling();

    public double getLuas(){
        return alas * tinggi / 2;
    }


    @Override
    public String toString() {
        return "Segitiga{" +
            " alas='" + alas + "'" +
            ", tinggi='" + tinggi + "'" +
            "}";
    }

}
