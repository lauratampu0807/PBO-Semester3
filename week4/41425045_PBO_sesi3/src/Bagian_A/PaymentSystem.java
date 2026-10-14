/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;
/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/

// Kelas utama untuk menjalankan sistem pembayaran
public class PaymentSystem {
    public static void main(String[] args) {
        // Menggunakan polimorfisme dengan referensi tipe interface
        PaymentMethod payment1 = new EWalletPayment("08123456789");
        PaymentMethod payment2 = new CreditCardPayment("4111-XXXX-XXXX-1234");

        // Memproses transaksi dari masing-masing metode pembayaran
        payment1.pay(50000);
        payment2.pay(150000);
    }
}