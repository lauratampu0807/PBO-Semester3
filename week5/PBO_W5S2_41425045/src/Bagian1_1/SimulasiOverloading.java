/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_1;


// Nama: Laura Tampubolon
//NIM: 41425045
//Prodi: D-IV TRPL

// Kelas untuk merepresentasikan mesin penghitung tarif ekspedisi
class MesinTarif {
    // Variabel instance untuk menyimpan informasi kota asal pengiriman
    private String kotaAsal;

    // Constructor untuk menginisialisasi objek MesinTarif dengan kota asal tertentu
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Method overloading 1: Menghitung ongkir berdasarkan berat saja (kg)
    public double hitungOngkir(double beratKg) {
        // Mengembalikan total biaya berdasarkan perkalian berat dan tarif dasar
        return beratKg * 10000;
    }

    // Method overloading 2: Menghitung ongkir dengan tambahan nilai barang (asuransi)
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        // Menghitung biaya asuransi sebesar 1% dari nilai barang
        double biayaAsuransi = nilaiBarang * 0.01;
        // Mengembalikan total ongkos kirim ditambah biaya asuransi
        return (beratKg * 10000) + biayaAsuransi;
    }

    // Method overloading 3: Menghitung ongkir dengan pilihan layanan express (boolean)
    public double hitungOngkir(double beratKg, boolean isExpress) {
        // Menghitung biaya dasar pengiriman
        double total = beratKg * 10000;
        // Jika pengiriman express bernilai true, tambahkan biaya tambahan sebesar 20000
        if (isExpress) {
            total += 20000;
        }
        // Mengembalikan total biaya akhir
        return total;
    }
}

// Kelas utama untuk menjalankan simulasi program overloading
public class SimulasiOverloading {
    // Method utama (entry point) dari program Java
    public static void main(String[] args) {
        // Membuat objek baru dari class MesinTarif dengan kota asal "Medan"
        MesinTarif tarif = new MesinTarif("Medan");
        
        // Menampilkan judul header simulasi ke konsol
        System.out.println("=== INI METHOD OVERLOADING ===");
        
        // Memanggil method hitungOngkir versi 1 (1 parameter: berat)
        System.out.println("Ongkir Biasa (2.0 Kg): Rp" + tarif.hitungOngkir(2.0));
        
        // Memanggil method hitungOngkir versi 2 (2 parameter: berat dan nilai barang)
        System.out.println("Ongkir + Asuransi (Barang 5Jt): Rp" + tarif.hitungOngkir(2.0, 5000000.0));
        
        // Memanggil method hitungOngkir versi 3 (2 parameter: berat dan status boolean express)
        System.out.println("Ongkir Express (2.0 Kg): Rp" + tarif.hitungOngkir(2.0, true));
    }
}

//LEMBAR ANALISIS OVERLOADING

// 1. Mengapa compiler dapat menentukan method hitungOngkir mana yang dijalankan sebelum
//    program dieksekusi (compile-time)? Bagian method apa yang diperiksa compiler?
// Compiler memeriksa signature method, yaitu nama method beserta jumlah, tipe, dan
// urutan parameternya. Saat kompilasi, tipe argumen di setiap pemanggilan sudah
// diketahui, misalnya hitungOngkir(2.0) cocok dengan versi (double),
// hitungOngkir(2.0, 5000000.0) cocok dengan (double, double), dan
// hitungOngkir(2.0, true) cocok dengan (double, boolean). Karena pencocokan hanya
// butuh informasi dari kode, keputusannya sudah final sebelum program berjalan
// (static/early binding).

// 2. Mengapa compiler menolak public int hitungOngkir(double beratKg) padahal tipe
//    kembaliannya berbeda (int vs double)?
// Karena return type bukan bagian dari signature method, jadi tidak ikut menentukan
// overloading. Method tersebut punya nama dan parameter yang sama persis dengan
// double hitungOngkir(double beratKg), sehingga dianggap duplikat. Compiler tidak bisa
// membedakannya dari pemanggilan hitungOngkir(2.0).
// Pesan error:
// error: method hitungOngkir(double) is already defined in class MesinTarif
