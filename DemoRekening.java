public class DemoRekening{

}// Kelas utama untuk menjalankan program
class demoRekeningBank {

    public static void main(String[] args) {
        // Membuat dua objek RekeningBank dengan nomor rekening, nama pemilik, dan saldo awal
        RekeningBank rekening1 = new RekeningBank("202410370110216", "Aulia Rahmi", 500000.0);
        RekeningBank rekening2 = new RekeningBank("202410370110204", "Muthia Salsabila", 1000000.0);

        // Menampilkan informasi rekening sebelum transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Menyetor uang ke masing-masing rekening
        rekening1.setorUang(200000.0);
        rekening2.setorUang(500000.0);

        // Menarik uang dari masing-masing rekening
        rekening1.tarikUang(800000.0); // Akan gagal karena saldo tidak mencukupi
        rekening2.tarikUang(300000.0); // Berhasil

        // Menampilkan informasi rekening setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}

// Kelas RekeningBank untuk merepresentasikan rekening bank
class RekeningBank {
    private final String nomorRekening; // Nomor rekening tidak dapat diubah setelah dibuat
    private final String namaPemilik; // Nama pemilik juga tidak dapat diubah setelah dibuat
    private double saldo; // Saldo dapat berubah seiring transaksi

    // Konstruktor untuk menginisialisasi objek RekeningBank
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    // Method untuk menyetor uang ke rekening
    public void setorUang(double jumlah) {
        saldo += jumlah; // Menambahkan jumlah setoran ke saldo
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    // Method untuk menarik uang dari rekening
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) { // Mengecek apakah saldo mencukupi untuk penarikan
            saldo -= jumlah; // Mengurangi saldo dengan jumlah yang ditarik
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }
}
