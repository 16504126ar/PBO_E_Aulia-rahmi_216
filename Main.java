package Tugas;

import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        int tahunSekarang = LocalDate.now().getYear();

        String firstname;
        String kelamin;
        int lahir;
        Scanner objInput = new Scanner(System.in);

        System.out.print("masukkan Nama : ");
        firstname = objInput.nextLine();

        System.out.print("masukkan kelamin anda (P/L) :");
        kelamin = objInput.nextLine();

        System.out.print("Masukkan tahun lahir : ");
        lahir = objInput.nextInt();

        lahir = tahunSekarang - lahir;

        String jeniskelamin;
        if (kelamin.equalsIgnoreCase("P")) {
            jeniskelamin = "perempuan";
        } else if (kelamin.equalsIgnoreCase("L")) {
            jeniskelamin = "laki-laki";
        } else {
            jeniskelamin = "tidak diketahui";
        }

        System.out.println("\nData Diri: ");
        System.out.println("Nama : " + firstname);
        System.out.println("jenis kelamin : " + jeniskelamin);
        System.out.println("umur : " + lahir + "tahun");

        objInput.close();
    }
}