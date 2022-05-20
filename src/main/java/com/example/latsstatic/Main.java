package com.example.latsstatic;

public class Main {
    public static void main(String[] args) {

        // System.out.println(Mahasiswa.prodi);
        // // System.out.println(Mahasiswa.nama);

        // Mahasiswa s1 = new Mahasiswa();
        // System.out.println(s1.prodi);
        // System.out.println(s1.nama);

        // Mahasiswa s2 = new Mahasiswa();
        // System.out.println(s2.prodi);
        // System.out.println(s2.nama);

        // s1.prodi = "Software Engineering";  
        // s1.nama = "Agus";
        // s2.prodi = "Software Engineering Technology";
        // s2.nama = "Salim";

        // System.out.println(s1.nama);
        // System.out.println(s1.prodi);

        // System.out.println(s2.nama);
        // System.out.println(s2.prodi);

        // System.out.println(Mahasiswa.prodi);

        Mahasiswa s1 = new Mahasiswa("Mr X satu");
        System.out.println(s1.getProdi());
        System.out.println(s1.getNama());

        Mahasiswa s2 = new Mahasiswa("Mr X dua");
        System.out.println(s2.getProdi());
        System.out.println(s2.getNama());

        s1.setProdi("Teknologi RPL");
        s1.setNama("agus");

        s2.setProdi("Teknologi rekayasa Perangkat Lunak");
        s2.setNama("Salim");

        Mahasiswa.setProdi("SOftware Engineering");

        System.out.println(s1.getProdi());
        System.out.println(s1.getNama());

        System.out.println(s2.getProdi());
        System.out.println(s2.getNama());


        
        
    }
}
