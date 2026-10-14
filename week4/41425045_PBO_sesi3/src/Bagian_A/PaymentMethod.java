/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;
/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/

// Interface kontrak standar untuk semua metode pembayaran
public interface PaymentMethod {
    double TRANSACTION_FEE = 2500.0; // Konstanta biaya admin (otomatis public static final)

    void pay(double amount);          // Method abstrak untuk proses pembayaran
    String getPaymentDetails();       // Method abstrak untuk mengambil detail pembayaran
}