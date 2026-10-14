/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package del.ac.id.anakan;

/* Nama: Laura Tampubolon
NIM: 41425045
*/

import del.ac.id.induk.Kendaraan;

// Class Mobil mewarisi (extends) class Kendaraan
public class Mobil extends Kendaraan {
    // Atribut tambahan khusus Mobil
    private int jlhTorsi, faktorPembagi;
    private float panjangGagang, rasioGigi;

    // Constructor kosong
    public Mobil() {}

    // Setter jumlah torsi
    public void setJlhTorsi(int value) {
        jlhTorsi = value;
    }

    // Setter panjang gagang
    public void setPanjangGagang(float value) {
        panjangGagang = value;
    }

    // Setter rasio gigi
    public void setRasioGigi(float value) {
        rasioGigi = value;
    }

    // Setter faktor pembagi
    public void setFaktorPembagi(int value) {
        faktorPembagi = value;
    }

    // Override: hasil dari induk dikalikan faktor pembagi
    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return super.kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi) * faktorPembagi;
    }

    // Override: cetak informasi lengkap mobil
    @Override
    public void cetakInformasi(Object o) {
        System.out.println("=====================================================");
        System.out.println(String.format("Mobil saya berwarna %s.",
                ((Mobil) o).getWarnaKendaraan()));
        System.out.println(String.format("Dimensi mobil tersebut adalah %d meter persegi",
                ((Mobil) o).getDimensiKendaraan()));
        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.",
                kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi)));
        System.out.println(String.format("Motor tersebut memiliki %d kaca spion dan %d roda. ",
                ((Mobil) o).getJlhSpion(), ((Mobil) o).getJlhRoda()));
        System.out.println("=====================================================");
    }
}
