/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;
/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/

import id.ac.del.rental.VehicleRental;
import id.ac.del.rental.MemberDiscount;

public class TestRental {
    public static void main(String[] args) {
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);
        
        // Memanggil setter dengan validasi yang benar
        v.setRentalDays(5); // Contoh: sewa selama 5 hari
        
        // Mengirimkan objek diskon melalui method getTotalCost (Dependency Injection)
        double total = v.getTotalCost(new MemberDiscount());
        
        System.out.println("Total Biaya setelah diskon: Rp" + total);
    }
}