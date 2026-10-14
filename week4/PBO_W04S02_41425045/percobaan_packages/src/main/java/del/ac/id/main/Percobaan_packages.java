/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package del.ac.id.main;

/* Nama: Laura Tampubolon
NIM: 41425045
*/

import del.ac.id.anakan.Mobil;
import del.ac.id.anakan.Motor;
import del.ac.id.anakan.Sepeda;

// Class utama untuk menjalankan program
public class Percobaan_packages {

    public static void main(String[] args) {
        // Buat objek Motor dan isi datanya
        Motor objMotor = new Motor();
        objMotor.setDimensiKendaraan(274);
        objMotor.setJlhRoda(2);
        objMotor.setJlhSpion(2);
        objMotor.setWarnaKendaraan("Hitam");
        objMotor.setJlhTorsi(1);
        objMotor.setPanjangGagang((float) 15.5);
        objMotor.setRasioGigi((float) 4.2);
        objMotor.setFaktorPembagi(2);

        // Buat objek Mobil dan isi datanya
        Mobil objMobil = new Mobil();
        objMobil.setDimensiKendaraan(632);
        objMobil.setJlhRoda(4);
        objMobil.setJlhSpion(2);
        objMobil.setWarnaKendaraan("Grey");
        objMobil.setJlhTorsi(1);
        objMobil.setPanjangGagang((float) 20.5);
        objMobil.setRasioGigi((float) 50.4);
        objMobil.setFaktorPembagi(3);

        // Buat objek Sepeda dan isi datanya
        Sepeda objSepeda = new Sepeda();
        objSepeda.setDimensiKendaraan(24);
        objSepeda.setJlhRoda(2);
        objSepeda.setJlhSpion(0);
        objSepeda.setWarnaKendaraan("Putih");

        // Cetak informasi masing-masing kendaraan
        objMotor.cetakInformasi(objMotor);
        objMobil.cetakInformasi(objMobil);
        objSepeda.cetakInformasi(objSepeda);
    }
}
