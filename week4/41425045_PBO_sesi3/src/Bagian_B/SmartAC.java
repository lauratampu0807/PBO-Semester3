/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;
/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/
public class SmartAC implements Switchable, Connectable {
    private boolean isOn = false;
    private int temperature;

    @Override
    public void turnOn() {
        isOn = true;
        temperature = 22;
        System.out.println("[AC PINTAR] Dinyalakan pada suhu " + temperature + " C.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[AC PINTAR] Dimatikan..");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println("[Error] AC Pintar gagal koneksi WiFi. Perangkat masih mati!");
            return;
        }
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}