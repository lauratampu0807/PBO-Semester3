/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package del.ac.id.induk;

/* Nama: Laura Tampubolon
NIM: 41425045
*/


// Class Kendaraan mengimplementasikan interface IKendaraan
public class Kendaraan implements IKendaraan {
    // Atribut data kendaraan
    private int jlhRoda, dimensiKendaraan, jlhSpion;
    public String warnaKendaraan;

    // Constructor kosong
    public Kendaraan() {}

    // Setter jumlah roda
    @Override
    public void setJlhRoda(int value) {
        jlhRoda = value;
    }

    // Setter dimensi kendaraan
    @Override
    public void setDimensiKendaraan(int value) {
        dimensiKendaraan = value;
    }

    // Setter jumlah spion
    @Override
    public void setJlhSpion(int value) {
        jlhSpion = value;
    }

    // Setter warna kendaraan
    @Override
    public void setWarnaKendaraan(String value) {
        warnaKendaraan = value;
    }

    // Cetak pesan jika objek null
    @Override
    public void cetakInformasi(Object o) {
        if (o == null) System.out.println("Obejct is Null");
    }

    // Getter jumlah roda
    @Override
    public int getJlhRoda() {
        return jlhRoda;
    }

    // Getter dimensi kendaraan
    @Override
    public int getDimensiKendaraan() {
        return dimensiKendaraan;
    }

    // Getter jumlah spion
    @Override
    public int getJlhSpion() {
        return jlhSpion;
    }

    // Getter warna kendaraan
    @Override
    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    // Hitung percepatan: torsi x panjang gagang x rasio gigi
    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return jlhTorsi * panjangGagang * rasioGigi;
    }
}
