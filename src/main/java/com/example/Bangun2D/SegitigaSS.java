package com.example.Bangun2D;

public class SegitigaSS extends Segitiga {

    public SegitigaSS(double sisi) {
        super(sisi, 0);
        super.setTinggi(getTinggi());
    }

    @Override
    public double getTinggi(){
        double sisi = getAlas();
        return 0.5 * sisi * Math.sqrt(3);
    }

    @Override
    public void setTinggi(double tinggi){
        double alasBaru = Math.sqrt((4.0 / 3) * tinggi * tinggi);
        setAlas(alasBaru);
    }

    @Override
    public double getKeliling() {
        return 3 * getAlas();
    }

    @Override
    public double getLuas() {
        return 0.5 * getAlas() * getTinggi();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
