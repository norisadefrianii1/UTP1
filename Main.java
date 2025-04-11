package utp.mains;

/* Norisa Defriani - 245150707111038
  /|    / / //   ) ) //   ) )    / /    //   ) )  // | | 
   //|   / / //   / / //___/ /    / /    ((        //__| | 
  // |  / / //   / / / ___ (     / /       \\     / ___  | 
 //  | / / //   / / //   | |    / /          ) ) //    | | 
//   |/ / ((___/ / //    | | __/ /___ ((___ / / //     |
         
*/

import java.util.Scanner;
import utp.shapes.LimasPersegi;
import utp.shapes.PrismaSegitigaSamaKaki;
import utp.shapes.Tabung;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.print("NAMA LENGKAP     : NORISA DEFRIANI ");
        System.out.println("");
        System.out.print("NIM              : 245150707111038 ");
        System.out.println("");
        System.out.println("===============================================");

        // PRISMA SEGITIGA SAMA KAKI
        System.out.println("Prisma Segitiga Sama Kaki");
        System.out.println("===============================================");
        System.out.print("Isikan alas      : ");
        double alas = scan.nextDouble();
        System.out.print("Isikan kaki      : ");
        double kaki = scan.nextDouble();
        System.out.print("Isikan tinggi    : ");
        double tinggiPrisma = scan.nextDouble();

        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        prisma.setNama("Prisma Segitiga Sama Kaki");
        prisma.setTinggi(tinggiPrisma);

        System.out.println("===============================================");
        prisma.printInfo();
        System.out.println("===============================================");

        // LIMAS PERSEGI
        System.out.println("Limas Persegi");
        System.out.println("===============================================");
        System.out.print("Isikan sisi      : ");
        double sisi = scan.nextDouble();
        System.out.print("Isikan tinggi    : ");
        double tinggiLimas = scan.nextDouble();

        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        limas.setNama("Limas Persegi");
        limas.setTinggi(tinggiLimas);

        System.out.println("===============================================");
        limas.printInfo();
        System.out.println("===============================================");

        // TABUNG
        System.out.println("Tabung");
        System.out.println("===============================================");
        System.out.print("Isikan radius    : ");
        double radius = scan.nextDouble();
        System.out.print("Isikan tinggi    : ");
        double tinggiTabung = scan.nextDouble();

        Tabung tabung = new Tabung();
        tabung.setNama("Tabung");
        tabung.setRadius(radius);
        tabung.setTinggi(tinggiTabung);

        System.out.println("===============================================");
        tabung.printInfo();
        System.out.println("===============================================");

    }
}