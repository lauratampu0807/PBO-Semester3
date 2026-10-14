/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;
/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/
public class MainSmartHome {
    public static void main(String[] args) {
        SmartLamp lamp = new SmartLamp();
        SmartAC ac = new SmartAC();

        // Uji coba aturan state management (mencoba konek saat mati)
        lamp.connectToWifi("Rumah_Indah_5G", "192.168.1.50"); // Gagal

        System.out.println();
        // Menyalakan lampu lalu menghubungkan ke WiFi
        lamp.turnOn();
        lamp.connectToWifi("Rumah_Indah_5G", "192.168.1.50"); // Berhasil[cite: 7]

        System.out.println();
        // Menyalakan AC lalu menghubungkan ke WiFi
        ac.turnOn(); // Berhasil[cite: 7]
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51"); // Berhasil[cite: 7]

        System.out.println();
        ac.turnOff(); // Mematikan AC[cite: 7]
    }
}
