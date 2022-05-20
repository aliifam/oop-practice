package com.example.Bangun2D;

import com.example.Matematika;

public class SegitigaSK extends Segitiga {

    public SegitigaSK(double alas, double tinggi) {
        super(alas, tinggi);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getKeliling() {
        // TODO Auto-generated method stub
        return 2 * getSisiMiring() + getAlas();
    }

    public double getSisiMiring(){
        return Matematika.getMiring(getAlas(), getTinggi());
    }

    @Override
    public String toString() {
        return "Segitiga Sama Kaki{" +
            " alas='" + getAlas() + "'" +
            ", tinggi='" + getTinggi() + "'" +
            "}";
    }
    
}
