/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/

// Kelas implementasi pembayaran menggunakan dompet digital (E-Wallet)
public class EWalletPayment implements PaymentMethod {
    private String phoneNumber; // Menyimpan nomor HP terkait E-Wallet

    // Konstruktor inisialisasi nomor HP
    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Memproses pembayaran dengan menambahkan biaya admin
    @Override
    public void pay(double amount) {
        double total = amount + TRANSACTION_FEE;
        System.out.println("[E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount 
                + " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }

    // Mengembalikan informasi detail metode pembayaran
    @Override
    public String getPaymentDetails() {
        return "Metode: E-Wallet (" + phoneNumber + ")";
    }
}