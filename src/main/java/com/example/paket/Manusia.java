package com.example.paket;

public class Manusia {

    String nama;


    public Manusia(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Manusia{" +
            " nama='" + getNama() + "'" +
            "}";
    }
    
}
