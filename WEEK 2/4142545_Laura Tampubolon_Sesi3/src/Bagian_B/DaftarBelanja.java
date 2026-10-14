/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

import java.util.Scanner;

/*
NIM: 41425045
Nama: Laura Tampubolon
Motto: Kalau belum berhasil di percobaan pertama, jadikan lah itu sebagai pelajaran */

public class DaftarBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daftar = new String[100]; // Array penampung item
        int jumlahItem = 0;                // Counter item
        boolean jalan = true;              // Flag loop menu

        //  LOOP MENU UTAMA 
        while (jalan) {
            System.out.println("\n== Daftar Belanja ==");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Bersihkan enter

            switch (pilihan) {
                //  TAMBAH ITEM 
                case 1:
                    System.out.print("Masukkan item: ");
                    String itemBaru = scanner.nextLine();
                    if (jumlahItem < daftar.length) {
                        daftar[jumlahItem] = itemBaru;
                        jumlahItem++;
                        System.out.println(itemBaru + " berhasil ditambahkan!");
                    } else {
                        System.out.println("Daftar belanja penuh!");
                    }
                    break;

                // HAPUS ITEM 
                case 2:
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong.");
                        break;
                    }
                    System.out.println("Daftar belanja saat ini:");
                    for (int i = 0; i < jumlahItem; i++) {
                        System.out.println((i + 1) + ". " + daftar[i]);
                    }
                    System.out.print("Hapus item pada posisi: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine();

                    if (pos >= 1 && pos <= jumlahItem) {
                        String dihapus = daftar[pos - 1];
                        // Geser elemen setelah posisi hapus ke kiri
                        for (int i = pos - 1; i < jumlahItem - 1; i++) {
                            daftar[i] = daftar[i + 1];
                        }
                        daftar[jumlahItem - 1] = null;
                        jumlahItem--;
                        System.out.println(dihapus + " berhasil dihapus!");
                    } else {
                        System.out.println("Posisi tidak valid!");
                    }
                    break;

                // AMPILKAN SEMUA 
                case 3:
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja kosong.");
                    } else {
                        System.out.println("Daftar belanja:");
                        for (int i = 0; i < jumlahItem; i++) {
                            System.out.println((i + 1) + ". " + daftar[i]);
                        }
                    }
                    break;

                // CARI ITEM 
                case 4:
                    System.out.print("Cari item: ");
                    String cari = scanner.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < jumlahItem; i++) {
                        if (daftar[i].equalsIgnoreCase(cari)) {
                            System.out.println(cari + " ditemukan pada posisi " + (i + 1));
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) System.out.println(cari + " tidak ditemukan.");
                    break;

                //KELUAR 
                case 5:
                    System.out.println("Terima kasih!");
                    jalan = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}


    