/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/

// Kelas implementasi pembayaran menggunakan kartu kredit
public class CreditCardPayment implements PaymentMethod {
    private String cardNumber; // Menyimpan nomor kartu

    // Konstruktor inisialisasi kartu
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Memproses verifikasi pembayaran kartu kredit
    @Override
    public void pay(double amount) {
        System.out.println("[Credit Card " + cardNumber + "] Pembayaran berhasil diverifikasi sebesar Rp" + amount);
    }

    // Mengembalikan informasi detail metode pembayaran
    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}