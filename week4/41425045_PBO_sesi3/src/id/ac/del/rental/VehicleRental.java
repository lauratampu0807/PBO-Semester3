/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/

public class VehicleRental {

    public String plateNumber;         // Bersifat public (bisa diakses bebas)
    protected double rentalRatePerDay; // Bersifat protected (antar subclass/package)
    private int rentalDays;            // Bersifat private (khusus dalam kelas ini)
    double discountRate;               // Bersifat default (dalam package yang sama)

    // Konstruktor untuk inisialisasi awal plat nomor dan tarif harian
    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;
        this.rentalRatePerDay = rate;
    }

    // Setter untuk mengubah jumlah hari sewa
    public void setRentalDays(int days) {
        this.rentalDays = days;
    }

    // Menghitung total biaya akhir setelah dikurangi diskon (menerapkan polimorfisme)
    public double getTotalCost(Discountable discount) {
        double amount = rentalRatePerDay * rentalDays;   // Hitung harga dasar sewa
        double discountAmount = discount.calculateDiscount(amount); // Hitung besar diskon
        return amount - discountAmount;    // Total tagihan bersih
    }
}