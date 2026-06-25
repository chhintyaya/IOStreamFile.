package tugas;

// Nama : Chintya Mahfuzah
// NPM  : [Isi NPM Kamu di Sini]

public class MainTugas {
    public static void main(String[] args) {
        
        System.out.println("=== 1. DAFTAR KATEGORI BARANG ===");
       
        String[] kategori = {"Elektronik", "Pakaian", "Makanan", "Alat Tulis"};
        
        for (int i = 0; i < kategori.length; i++) {
            System.out.println("- Kategori " + (i + 1) + ": " + kategori[i]);
        }
        System.out.println();

        System.out.println("=== 2. INISIALISASI GUDANG AWAL & SIMPAN BERKAS ===");
        
        Gudang gudangUtama = new Gudang("barang.txt");
        
        
        // Menambah objek Barang ke gudang utama
        gudangUtama.tambahBarang(new Barang("Laptop Asus", 8500000, 5));
        gudangUtama.tambahBarang(new Barang("Mouse Wireless", 150000, 15));
        gudangUtama.tambahBarang(new Barang("Keyboard Mekanikal", 450000, 8));
        gudangUtama.tambahBarang(new Barang("Monitor 24 Inch", 1750000, 4));
        gudangUtama.tambahBarang(new Barang("Printer Inkjet", 1200000, 3));

        // Tampilkan data gudang awal (Baris 30 yang error tadi sudah dihapus)
        gudangUtama.tampilkanSemua();
        
        // Menyimpan data ke berkas barang.txt
        gudangUtama.simpanKeBerkas();

        
      
        System.out.println();

        System.out.println("=== 3. MEMBUAT OBJEK GUDANG BARU & MEMUAT DARI BERKAS ===");
       
        Gudang gudangBaru = new Gudang("barang.txt");
        
        
        gudangBaru.muatDariBerkas();
        
       
        System.out.println("\n== Isi Gudang Baru (Hasil Load Berkas) ==");
        gudangBaru.tampilkanSemua();
        
      
        System.out.println("Total Nilai Persediaan Barang: Rp" + gudangBaru.totalNilai());
    }
}