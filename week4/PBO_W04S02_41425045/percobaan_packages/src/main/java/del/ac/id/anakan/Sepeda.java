/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package del.ac.id.anakan;

/* Nama: Laura Tampubolon
NIM: 41425045
*/


import del.ac.id.induk.Kendaraan;

// Class Sepeda mewarisi (extends) class Kendaraan
public class Sepeda extends Kendaraan {
    // Constructor kosong
    public Sepeda() {}

    // Override: jika ada nilai 0 maka percepatan 10.0, selain itu hitung biasa
    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return (jlhTorsi == 0 || panjangGagang == 0 || rasioGigi == 0) ? (float) 10.0 :
                (jlhTorsi * panjangGagang * rasioGigi);
    }

    // Override: cetak informasi lengkap sepeda
    @Override
    public void cetakInformasi(Object o) {
        System.out.println("=====================================================");
        System.out.println(String.format("Sepeda saya berwarna %s.",
                ((Sepeda) o).getWarnaKendaraan()));
        System.out.println(String.format("Dimensi sepeda tersebut adalah %d meter persegi",
                ((Sepeda) o).getDimensiKendaraan()));
        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.",
                kalkulasiPercepatan(0, 0, 0)));
        System.out.println(String.format("sepeda tersebut memiliki %d kaca spion dan %d roda. ",
                ((Sepeda) o).getJlhSpion(), ((Sepeda) o).getJlhRoda()));
        System.out.println("=====================================================");
    }
}
