package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        
        System.out.println("=== SOAL NOMOR 1 ===");
       
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
       
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : hari) {
                penulis.println(h);
            }
            System.out.println("Berhasil menulis 5 nama hari ke hari.txt\n");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }
        
       
        System.out.println("Isi berkas hari.txt saat ini:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        
        System.out.println("\n=== SOAL NOMOR 2 ===");
     
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("Berhasil menambahkan Sabtu dan Minggu.\n");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
        
        
        System.out.println("Isi berkas hari.txt setelah di-append:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        
        System.out.println("\n=== SOAL NOMOR 3 ===");
        
        int jumlahBaris = 0;
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println("Jumlah baris yang ada di dalam berkas: " + jumlahBaris);
    }
}