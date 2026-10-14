/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TantanganEkstra;
// Nama: Laura Tampubolon
//NIM: 41425045
//Prodi: D-IV TRPL

/*
 * array bertipe parent class (KendaraanEkspedisi[]) diisi objek child class
 * yang berbeda, lalu dipanggil dengan SATU for-loop tanpa mengecek jenis child.
 */
public class TantanganEkstra {
    public static void main(String[] args) {
        System.out.println("=== TANTANGAN EKSTRA: ARRAY POLIMORFIK ===");

        // Array bertipe parent, isinya objek child yang berbeda-beda
        KendaraanEkspedisi[] armada = {
            new TrukBox("BK 1111 AA", 6000),
            new MobilVan("BK 2222 BB", 900),
            new TrukBox("BK 3333 CC", 4000)
        };

        // Satu for-loop: JVM otomatis memilih versi angkutBarang() sesuai objek aslinya,
        // tanpa perlu if/instanceof untuk membedakan TrukBox atau MobilVan
        for (KendaraanEkspedisi kendaraan : armada) {
            kendaraan.infoKendaraan();
            kendaraan.angkutBarang("Paket Campuran");
        }
    }
}
