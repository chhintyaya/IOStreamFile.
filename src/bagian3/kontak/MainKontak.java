package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // 1. Membuat objek pengelola dan mengisinya (Sudah dengan Atribut Email)
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@gmail.com"));

        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        // 2. Membuat objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
        
        // Uji Langkah 1: cariKontak (Contoh dari Kunci Jawaban)
        System.out.println("\n== Uji Cari Kontak == ");
        bukuLain.cariKontak("Budi");
        bukuLain.cariKontak("Zaki");

        // Uji Langkah 3: hapusKontak
        System.out.println("\n== Uji Hapus Kontak == ");
        bukuLain.hapusKontak("Andi");
        
        System.out.println("\n== Tampilkan Hasil Akhir Setelah Hapus == ");
        bukuLain.tampilkanSemua();
    }
}