package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        
        System.out.println("=== SOAL NOMOR 1 ===");
        // 1. Buat objek File yang menunjuk laporan.txt
        File berkasLaporan = new File("laporan.txt");
       
        if (berkasLaporan.exists()) {
            System.out.println("Berkas ada, ukuran: " + berkasLaporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        
        System.out.println("\n=== SOAL NOMOR 2 ===");
       
        File folderArsip = new File("arsip");
        boolean isFolderDibuat = folderArsip.mkdir();
       
        if (isFolderDibuat) {
            System.out.println("Folder 'arsip' BERHASIL dibuat.");
        } else {
            System.out.println("Folder 'arsip' GAGAL dibuat (atau folder sudah ada).");
        }

        
        System.out.println("\n=== SOAL NOMOR 3 ===");
       
        File berkasSementara = new File("sementara.txt");
        try {
            
            berkasSementara.createNewFile();
           
            System.out.println("Sebelum dihapus, apakah ada? " + berkasSementara.exists());
            
          
            berkasSementara.delete();
           
            System.out.println("Sesudah dihapus, apakah ada? " + berkasSementara.exists());
            
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}