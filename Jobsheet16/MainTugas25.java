package Jobsheet16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList; 
import java.util.Queue;

public class MainTugas25 {
    static ArrayList<MahasiswaTugas25> daftarMhs = new ArrayList<>();
    static ArrayList<MataKuliahTugas25> daftarMK = new ArrayList<>();
    static ArrayList<NilaiTugas25> daftarNilai = new ArrayList<>();
    static Queue<NilaiTugas25> antrianNilai = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      
        daftarMhs.add(new MahasiswaTugas25("20001", "Thalhah", "08123456789"));
        daftarMhs.add(new MahasiswaTugas25("20002", "Zubair", "08987654321"));
        daftarMhs.add(new MahasiswaTugas25("20003", "Abdur-Rahman", "08123456789"));
        daftarMhs.add(new MahasiswaTugas25("20004", "Sa'ad", "08876543210"));
        daftarMhs.add(new MahasiswaTugas25("20005", "Sa'id", "08123456789"));
        daftarMhs.add(new MahasiswaTugas25("20006", "Ubaidah", "08123456789"));

        daftarMK.add(new MataKuliahTugas25("00001", "Internet of things", 3));
        daftarMK.add(new MataKuliahTugas25("00002", "Algoritma dan Struktur Data", 2));
        daftarMK.add(new MataKuliahTugas25("00003", "Algoritma dan Pemrograman", 2));
        daftarMK.add(new MataKuliahTugas25("00004", "praktikum algoritma dan Struktur Data", 3));
        daftarMK.add(new MataKuliahTugas25("00005", "praktikum Algoritma dan pemograman", 3));

        int pilih;
        do {
            tampilMenu();
            System.out.print("Pilih   : ");
            pilih = sc.nextInt();
            sc.nextLine(); 
            switch (pilih) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariMahasiswa();
                    break;
                case 4:
                    urutNilai();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                case 6:
                    hapusNilai();
                break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);

        sc.close();
    }

    static void cetakGaris() {
        for (int i = 0; i < 45; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void tampilMenu() {
        cetakGaris();
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        cetakGaris();
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Keluar");
        System.out.println("6. hapus data milai");
        cetakGaris();
    }

    static void inputNilai() {
        System.out.println("\n=== INPUT NILAI ===");
        
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        MahasiswaTugas25 mhsTerpilih = null;
        for (MahasiswaTugas25 m : daftarMhs) {
            if (m.nim25.equals(nim)) {
                mhsTerpilih = m;
                break;
            }
        }
        
        if (mhsTerpilih == null) {
            System.out.println("NIM Mahasiswa tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kodeMK = sc.nextLine();
        MataKuliahTugas25 mkTerpilih = null;
        for (MataKuliahTugas25 mk : daftarMK) {
            if (mk.kodeMK25.equals(kodeMK)) {
                mkTerpilih = mk;
                break;
            }
        }

        if (mkTerpilih == null) {
            System.out.println("Kode Mata Kuliah tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan Nilai (0-100) : ");
        double nilai = sc.nextDouble();
        sc.nextLine();

        daftarNilai.add(new NilaiTugas25(mhsTerpilih, mkTerpilih, nilai));
        System.out.println();
    }

    static void tampilNilai() {
        System.out.println("\n=== TAMPIL NILAI ===");
        if (daftarNilai.isEmpty()) {
            System.out.println("Belum ada data");
        } else {
            for (NilaiTugas25 n : daftarNilai) {
                System.out.println(n.mhs.nim25 + " - " + n.mhs.nama25 + " - " + n.mk.namaMK25 + " - " + n.nilai);
            }
        }
        System.out.println();
    }

    
    static void cariMahasiswa() {
        System.out.println("\n=== MENCARI NILAI MAHASISWA ===");
        
        System.out.println("Daftar Nilai Saat Ini:");
        if (daftarNilai.isEmpty()) {
            System.out.println("[ Belum ada data nilai yang diinput ]");
            System.out.println();
            return; 
        } else {
            for (NilaiTugas25 n : daftarNilai) {
                System.out.println("- " + n.mhs.nim25 + " - " + n.mhs.nama25 + " - " + n.mk.namaMK25 + " - " + n.nilai);
            }
        }
        System.out.println();

        System.out.print("Masukkan NIM yang dicari : ");
        String nimCari = sc.nextLine();
        
        boolean ditemukan = false;
        for (NilaiTugas25 n : daftarNilai) {
            if (n.mhs.nim25.equals(nimCari)) {
                System.out.println("Ditemukan : " + n.mhs.nama25 + " - " + n.mk.namaMK25 + " - " + n.nilai);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan dalam daftar nilai.");
        }
        System.out.println();
    }

    static void urutNilai() {
        Collections.sort(daftarNilai, (a, b) -> b.mhs.nim25.compareTo(a.mhs.nim25));
        
        System.out.println("\n=== URUT DATA NILAI (NIM Tertinggi ke Terendah) ===");
        for (NilaiTugas25 n : daftarNilai) {
            System.out.println(n.mhs.nim25 + " - " + n.mhs.nama25 + " - " + n.mk.namaMK25 + " - " + n.nilai);
        }
        System.out.println();
    }
  static void hapusNilai() {
        System.out.println("\n=== HAPUS DATA NILAI (CARI NIM) ===");
       
        if (daftarNilai.isEmpty()) {
            System.out.println("Daftar nilai kosong! Tidak ada data yang bisa dihapus.");
            return;
        }

        System.out.print("Masukkan NIM Mahasiswa yang mau dihapus: ");
        String nimHapus = sc.nextLine();
        
        boolean ditemukan = false;
        for (int i = 0; i < daftarNilai.size(); i++) {
            if (daftarNilai.get(i).mhs.nim25.equals(nimHapus)) {
             
                NilaiTugas25 dihapus = daftarNilai.remove(i); 
                
                System.out.println("Data nilai berikut berhasil dihapus:");
                System.out.println("NIM         : " + dihapus.mhs.nim25);
                System.out.println("Nama        : " + dihapus.mhs.nama25);
                System.out.println("Mata Kuliah : " + dihapus.mk.namaMK25);
                System.out.println("Nilai       : " + dihapus.nilai);
                
                ditemukan = true;
                break; 
            }
        }
        
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan di daftar nilai.");
        }
        System.out.println();
    }
}