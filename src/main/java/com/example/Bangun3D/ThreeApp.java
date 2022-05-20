package com.example.Bangun3D;

import com.example.Bangun2D.Segitiga;
import com.example.Bangun2D.SegitigaSK;

public class ThreeApp {
    public static void main(String[] args) {
        
        Segitiga segi3 = new SegitigaSK(3, 4);
        PrismaSegitiga prisma1 = new PrismaSegitiga(segi3, 10);
        System.out.println(prisma1);
        System.out.println(prisma1.getVolume());
        System.out.println(prisma1.getDetailAlas());
        System.out.println("-------------------------------------------");

        SegitigaSK kaki = new SegitigaSK(10, 7);
        PrismaSegitiga prisma2 = new PrismaSegitiga(kaki, 10);
        System.out.println(prisma2);
        System.out.println(prisma2.getVolume());
        System.out.println(prisma2.getDetailAlas());
    }
}
