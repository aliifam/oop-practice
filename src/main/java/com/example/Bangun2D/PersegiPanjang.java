package com.example.Bangun2D;

public class PersegiPanjang implements Bangun2D {
    
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return this.panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return this.lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getKeliling() {
        return 2*(panjang + lebar);
    }

    public double getLuas() {
        return panjang*lebar;
    }

    @Override
    public String toString() {
        return "Persegi Panjang {" +
            " panjang='" + getPanjang() + "'" +
            ", lebar='" + getLebar() + "'" +
            "}";
    }

    
}
