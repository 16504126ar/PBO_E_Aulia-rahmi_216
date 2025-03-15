public class Hewan {
    public String Nama;
    public String Jenis;
    public String Suara;
    public void tampilkanInfo() {
    }
}
// Mendefinisikan kelas Hewan
class main {
    // Deklarasi atribut untuk menyimpan informasi hewan
    String Nama;  // Nama hewan
    String Jenis; // Jenis hewan
    String Suara; //  yang dihasilkan hewan

    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        // Menampilkan informasi nama, jenis, dan suara hewan
        System.out.println("Nama  : " + Nama);
        System.out.println("Jenis : " + Jenis);
        System.out.println(" : " + Suara);
        System.out.println(); // Memberikan baris kosong agar tampilan lebih rapi
    }
}