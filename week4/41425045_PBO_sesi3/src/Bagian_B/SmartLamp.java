/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;
/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/
public class SmartLamp implements Switchable, Connectable {
    private boolean isOn = false; // Status sakelar
    private int brightness;

    @Override
    public void turnOn() {
        isOn = true;
        brightness = 80;
        System.out.println("[Smart Lamp] Menyala dengan kecerahan " + brightness + "%.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[Smart Lamp] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // Validasi State Management: Tidak boleh terkoneksi jika perangkat mati
        if (!isOn) {
            System.out.println("[Error] Smart Lamp gagal koneksi WiFi. Perangkat masih mati!");
            return;
        }
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}
