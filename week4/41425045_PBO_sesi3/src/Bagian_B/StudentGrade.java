/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;
/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL
*/
package Bagian_B;

public class StudentGrade {
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUts;
    private String gradeHuruf; // Read-only property

    // Konstruktor dengan validasi registrasi data awal mahasiswa
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: NIM=" + nim + " - Nama=" + nama);
    }

    // Getter read-only untuk NIM dan Nama (tanpa setter)
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public double getNilaiKuis() { return nilaiKuis; }
    public double getNilaiUts() { return nilaiUts; }
    public String getGradeHuruf() { return gradeHuruf; }

    // Setter nilai kuis dengan validasi rentang 0.0 sampai 100.0
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
            hitungGradeHuruf(); // Kalkulasi otomatis setiap nilai berubah
        } else {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis + " (Harus antara 0 - 100)");
        }
    }

    // Setter nilai UTS dengan validasi rentang 0.0 sampai 100.0
    public void setNilaiUts(double nilaiUts) {
        if (nilaiUts >= 0.0 && nilaiUts <= 100.0) {
            this.nilaiUts = nilaiUts;
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUts);
            hitungGradeHuruf(); // Kalkulasi otomatis setiap nilai berubah
        } else {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUts + " (Harus antara 0 - 100)");
        }
    }

    // Method private untuk kalkulasi otomatis gradeHuruf (State Management internal)
    private void hitungGradeHuruf() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 80) gradeHuruf = "A";
        else if (nilaiAkhir >= 70) gradeHuruf = "B";
        else if (nilaiAkhir >= 60) gradeHuruf = "C";
        else if (nilaiAkhir >= 50) gradeHuruf = "D";
        else gradeHuruf = "E";
    }

    // Method untuk menghitung nilai akhir (40% Kuis + 60% UTS)
    public double hitungNilaiAkhir() {
        return (0.4 * nilaiKuis) + (0.6 * nilaiUts);
    }

    // Method untuk mencetak laporan hasil studi
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS  : " + nilaiUts);
        System.out.println("Grade Huruf: " + gradeHuruf);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }
}