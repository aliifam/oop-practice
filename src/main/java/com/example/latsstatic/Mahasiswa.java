package com.example.latsstatic;

public class Mahasiswa {
    
    private static String prodi = "TRPL";
    private String nama;


    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public static void setProdi(String prodi) {
        Mahasiswa.prodi = prodi;
    }


    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // public static void gantiNama(String nama){
    //     this.nama = nama;
    // }

    // public static String tanyaNama(){
    //     return nama;
    // }

    // public static String getDetail(){
    //     return "Mahasiswa{" + get
    // }

    @Override
    public String toString() {
        return "{" +
            " nama=" + getNama() + " prodi=" + getProdi() +
            "}";
    }

}
