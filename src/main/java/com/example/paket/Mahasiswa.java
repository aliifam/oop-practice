package com.example.paket;

public class Mahasiswa extends Manusia {


    public Mahasiswa(String nama) {
        super(nama);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void setNama(String nama){
        this.nama = nama + nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
            " nama='" + getNama() + "'" +
            "}";
    }
    

}
