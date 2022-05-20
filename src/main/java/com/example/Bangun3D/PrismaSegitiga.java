package com.example.Bangun3D;

import com.example.Bangun2D.Segitiga;
import com.example.Bangun2D.SegitigaSK;
import com.example.Bangun2D.SegitigaSS;
import com.example.Bangun2D.SegitigaSiku;

public class PrismaSegitiga{
    private Segitiga alas;
    private double tinggi;

    public PrismaSegitiga(Segitiga alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga getAlas() {
        return this.alas;
    }

    public void setAlas(Segitiga alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume(){
        return alas.getLuas() * tinggi;
    }

    public double getLuas(){
        return 2 * alas.getLuas() + alas.getKeliling() * tinggi;
    }

    public String getDetailAlas(){
        if (alas instanceof SegitigaSiku) {
            return "Segitiga Siku siku";
        } else if (alas instanceof SegitigaSK) {
            return "Segitiga Sama Kaki";
        } else if (alas instanceof SegitigaSS) {
            return "segitiga sama sisi";
        } else {
            return "segitiga";
        }
    }


    @Override
    public String toString() {
        return "Prisma Segitiga{" +
            " alas='" + alas + "'" +
            ", tinggi='" + tinggi + "'" +
            "}";
    }
}