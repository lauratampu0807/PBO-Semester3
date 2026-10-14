/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TantanganEkstra;
// Nama: Laura Tampubolon
//NIM: 41425045
//Prodi: D-IV TRPL

/*
 Berisi abstract class KendaraanEkspedisi beserta subclass konkretnya (TrukBox, MobilVan).
 */

// ABSTRACT CLASS: blueprint semua kendaraan ekspedisi, tidak boleh di-new langsung
abstract class KendaraanEkspedisi {
    protected String noPolisi;   // plat nomor kendaraan
    protected int kapasitasKg;   // daya angkut dalam Kg

    // Constructor tetap boleh ada; dipanggil oleh subclass lewat super()
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Concrete method (punya body): diwariskan apa adanya ke semua subclass
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Abstract method (tanpa body, diakhiri ;): WAJIB diimplementasikan subclass konkret
    public abstract void angkutBarang(String namaBarang);
}

// Subclass konkret 1: truk dengan kontainer tertutup pendingin
class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg); // teruskan data ke parent
    }

    // Implementasi abstract method dari parent
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang +
                "' ke dalam kontainer tertutup pendingin.");
    }
}

// Subclass konkret 2: mobil van untuk distribusi dalam kota
class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg); // teruskan data ke parent
    }

    // Implementasi abstract method dari parent
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang +
                "' di bagasi belakang untuk distribusi kota.");
    }
}
