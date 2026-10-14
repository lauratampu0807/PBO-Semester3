/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_2;
// Nama: Laura Tampubolon
//NIM: 41425045
//Prodi: D-IV TRPL

// Mendefinisikan kelas parent bernama KurirReguler
class KurirReguler {
    // Variabel/atribut untuk menyimpan nama kurir dengan akses protected
    protected String nama;

    // Constructor untuk menginisialisasi objek KurirReguler dengan nama tertentu
    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method dasar untuk mengirim barang lewat jalur darat
    public void kirimBarang(String alamat) {
        // Menampilkan pesan pengiriman paket reguler ke terminal/konsol
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

// Mendefinisikan kelas child KurirDrone yang mewarisi (extends) KurirReguler (Pewarisan/Inheritance)
class KurirDrone extends KurirReguler {
    // Atribut tambahan khusus yang dimiliki oleh KurirDrone
    private String idDrone;

    // Constructor untuk KurirDrone yang menerima parameter nama dan idDrone
    public KurirDrone(String nama, String idDrone) {
        // Memanggil constructor dari kelas parent (KurirReguler) menggunakan super
        super(nama);
        // Menginisialisasi atribut idDrone milik kelas ini
        this.idDrone = idDrone;
    }

    // Anotasi @Override menandakan method ini menimpa/mengganti method kirimBarang dari parent class (Method Overriding)
    @Override
    public void kirimBarang(String alamat) {
        // Menampilkan pesan pengiriman khusus menggunakan drone langsung ke koordinat tujuan
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama + 
                           " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

// Kelas utama (Main Class) untuk menjalankan simulasi program Method Overriding
public class SimulasiOverriding {
    // Method utama (entry point) dari program Java
    public static void main(String[] args) {
        // Menampilkan teks judul ke konsol
        System.out.println("=== INI METHOD OVERRIDING ===");

        // Membuat objek pertama dengan tipe referensi KurirReguler dan bentuk objek KurirReguler
        KurirReguler k1 = new KurirReguler("Budi");

        // Membuat objek kedua menggunakan Polimorfisme: referensi KurirReguler, tetapi bentuk objek aslinya adalah KurirDrone
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        // Memanggil method kirimBarang pada objek k1 (akan menjalankan method versi KurirReguler)
        k1.kirimBarang("Jl. Sudirman No. 10");
        
        // Memanggil method kirimBarang pada objek k2 (akan menjalankan method versi KurirDrone karena terjadi Runtime Polymorphism)
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

//LEMBAR ANALISIS OVERRIDING 

// 1. Output k2.kirimBarang("Gedung Graha Lt. 5") setelah @Override dihapus dan nama
//    method diubah menjadi kirimbarang (b kecil):
// Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat menembus kemacetan.
// Jadi berubah menjadi "lewat jalur darat". Alasannya, kirimbarang (b kecil) adalah
// method baru yang berbeda dari kirimBarang, jadi bukan override. Variabel k2 bertipe
// KurirReguler, sehingga yang dipanggil adalah kirimBarang milik parent (jalur darat).

// 2. Pesan error setelah @Override dikembalikan di atas method yang salah ketik:
// error: method does not override or implement a method from a supertype
//     @Override
//     ^

// 3. Fungsi utama @Override bagi programmer:
// @Override memberi tahu compiler bahwa method di bawahnya dimaksudkan untuk menimpa
// method milik parent class. Compiler lalu mengecek apakah method itu benar-benar ada
// di parent. Kalau ada salah ketik atau parameternya berbeda, compiler langsung
// menampilkan error. Tanpa @Override, kesalahan seperti itu tidak terdeteksi dan baru
// ketahuan dari perilaku program yang aneh (misalnya drone malah lewat jalur darat).
// Jadi fungsinya mencegah bug overriding yang tidak disengaja dan memperjelas kode.
