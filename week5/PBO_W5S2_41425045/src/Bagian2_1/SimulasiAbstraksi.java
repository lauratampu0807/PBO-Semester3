/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian2_1;
// Nama: Laura Tampubolon
//NIM: 41425045
//Prodi: D-IV TRPL

// Abstract class: blueprint kendaraan ekspedisi, tidak boleh dibuat objeknya langsung dengan new
abstract class KendaraanEkspedisi {
    // Atribut yang diwariskan ke subclass: plat nomor dan kapasitas angkut (Kg)
    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor: mengisi noPolisi dan kapasitasKg, dipanggil subclass lewat super()
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Concrete method (punya body): menampilkan info plat nomor dan daya angkut
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Abstract method (tanpa body, diakhiri ;): wajib diimplementasikan oleh subclass konkret
    public abstract void angkutBarang(String namaBarang);
}

// Subclass konkret TrukBox: turunan dari KendaraanEkspedisi
class TrukBox extends KendaraanEkspedisi {
    // Constructor: meneruskan noPolisi dan kapasitasKg ke constructor parent
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi (override) abstract method angkutBarang() dari parent
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang +
                "' ke dalam kontainer tertutup pendingin.");
    }
}

// Subclass konkret MobilVan: turunan dari KendaraanEkspedisi
class MobilVan extends KendaraanEkspedisi {
    // Constructor: meneruskan noPolisi dan kapasitasKg ke constructor parent
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi (override) abstract method angkutBarang() dari parent
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang +
                "' di bagasi belakang untuk distribusi kota.");
    }
}

// LEMBAR ANALISIS ABSTRAKSI

// EKSPERIMEN 1
// Pesan error saat baris PERCOBAAN 1 di-uncomment:
// error: KendaraanEkspedisi is abstract; cannot be instantiated
//
// Mengapa Java menggagalkan baris ini?
// Karena KendaraanEkspedisi adalah abstract class, yaitu hanya konsep/blueprint
// yang belum lengkap dan bentuk fisiknya belum jelas. Class ini punya abstract
// method angkutBarang() yang belum ada isinya, jadi objeknya tidak boleh dibuat
// dengan new. Sama seperti contoh dealer: harus menyebut bentuk nyatanya
// (kelas konkret) seperti TrukBox atau MobilVan.

// EKSPERIMEN 2
// Class MotorKurir extends KendaraanEkspedisi tanpa method angkutBarang():
//
// class MotorKurir extends KendaraanEkspedisi {
//     public MotorKurir(String noPolisi, int kapasitasKg) {
//         super(noPolisi, kapasitasKg);
//     }
// }
//
// Pesan error:
// error: MotorKurir is not abstract and does not override abstract method
// angkutBarang(String) in KendaraanEkspedisi
//
// Dua opsi solusi yang ditawarkan IDE:
// 1. Implement abstract methods -> IDE membuatkan method angkutBarang(String namaBarang)
//    di dalam MotorKurir yang tinggal diisi.
// 2. Make class 'MotorKurir' abstract -> MotorKurir dijadikan abstract sehingga tidak
//    wajib mengimplementasikan method tersebut (tapi jadi tidak bisa di-new).
