package com.example.Bangun3D;

import com.example.Bangun2D.PersegiPanjang;

public class Balok extends PersegiPanjang {

    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double getLuas() {
        return 2 * (getPanjang() * getLebar() + getPanjang() * tinggi + getLebar() * tinggi);
    }

    @Override
    public double getKeliling(){
        return 3 * getPanjang() + getLebar() + tinggi;
    }

    public double getLuasAlas(){
        return super.getLuas();
    }

    public double getVolume(){
        return getPanjang() * getLebar() * tinggi;
    }

    @Override
    public String toString(){
        return "Balok{" + "panjang=" + getPanjang() + 
        " lebar=" + getLebar() + 
        " Tinggi=" + tinggi + "}";
    }
    
}
