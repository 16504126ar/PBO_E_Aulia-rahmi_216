package Tugas;
import java.util.Scanner;
class Tugas1_Modul_1 {
    public static void main(String[] args) {
        Scanner objinput = new Scanner(System.in);
        int Pilihan;
        boolean ulang = true;

        do {
            System.out.println("\nPilih Login : ");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan Pilihan : ");

            while (!objinput.hasNextInt()) {
                System.out.println("Input tidak valid! Masukkan angka 1 atau 2.");
                objinput.next();
                System.out.print("Masukkan Pilihan : ");
            }
            Pilihan = objinput.nextInt();
            objinput.nextLine();

            if (Pilihan == 1) {
                System.out.println("\n=== Login Admin ===");
                boolean LoginAdminBerhasil = false;

                do {
                    System.out.print("Masukkan Username : ");
                    String username = objinput.nextLine();
                    System.out.print("Masukkan Password : ");
                    String password = objinput.nextLine();

                    if (username.equals("Admin216") && password.equals("Password216")) {
                        System.out.println("Login Admin berhasil");
                        LoginAdminBerhasil = true;
                        ulang = false;
                    } else {
                        System.out.println("Login Gagal! Username atau Password salah.\n");
                    }
                } while (!LoginAdminBerhasil);

            } else if (Pilihan == 2) {
                System.out.println("\n=== Login Mahasiswa ===");
                boolean LoginMahasiswaBerhasil = false;

                do {
                    System.out.print("Masukkan Nama : ");
                    String nama = objinput.nextLine();
                    System.out.print("Masukkan NIM : ");
                    String nim = objinput.nextLine();

                    if (nama.equals("Aulia rahmi") && nim.equals("202410370110216")) {
                        System.out.println("Login Mahasiswa Berhasil");
                        System.out.println("Nama : " + nama);
                        System.out.println("NIM : " + nim);
                        LoginMahasiswaBerhasil = true;
                        ulang = false;
                    } else {
                        System.out.println("Login Gagal! Nama atau NIM salah.\n");
                    }
                } while (!LoginMahasiswaBerhasil);

            } else {
                System.out.println("Pilihan Tidak Valid!\n");
            }

        } while (ulang);

        objinput.close();
    }
}
