package com.example.Bangun2D;

import com.example.Matematika;

public class SegitigaSiku extends Segitiga {

    public SegitigaSiku(double alas, double tinggi) {
        super(alas, tinggi);
    }

    public double getSisiMiring(){
        return Matematika.getMiring(getAlas(), getTinggi());
    }

    @Override
    public double getKeliling() {
        // TODO Auto-generated method stub
        return getAlas() + getTinggi() + getSisiMiring();
    }
    
    @Override
    public String toString() {
        return "Segitiga Siku Siku{" +
            " alas='" + getAlas() + "'" +
            ", tinggi='" + getTinggi() + "'" +
            "}";
    }

}
