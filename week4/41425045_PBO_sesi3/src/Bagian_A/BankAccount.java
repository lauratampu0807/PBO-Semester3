/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

/*Nama: Laura Tampubolon
NIM: 41425045
Prodi: D-IV TRPL

 * Variabel dikunci dengan private, sehingga hanya bisa diubah lewat
 * method (deposit/withdraw) yang sudah memiliki validasi.
 */
public class BankAccount {

    // Atribut dibuat private agar tidak bisa diakses/diubah langsung dari luar kelas
    private String accountNumber; // nomor rekening
    private double balance;       // saldo tabungan

    // Constructor: menerima nomor rekening dan saldo awal
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        // Validasi: saldo awal tidak boleh negatif
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }

    // Getter: membaca nomor rekening
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter: membaca saldo (tidak ada setter langsung untuk saldo)
    public double getBalance() {
        return balance;
    }

    // Mutator: setor tunai, jumlah harus positif
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount; // tambah saldo
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari 0!");
        }
    }

    // Mutator: tarik tunai, tidak boleh membuat saldo minus
    public void withdraw(double amount) {
        if (amount <= 0) {
            // jumlah penarikan nol atau negatif tidak valid
            System.out.println("Jumlah penarikan tidak valid!");
        } else if (amount > this.balance) {
            // penarikan melebihi saldo ditolak
            System.out.println("Penarikan gagal: Saldo tidak mencukupi!");
        } else {
            this.balance -= amount; // kurangi saldo
            System.out.println("Tarik tunai berhasil: Rp" + amount);
        }
    }

    // Method main: menguji kelas BankAccount
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", 500000);

        acc.deposit(-100000);  // ditolak: setoran negatif
        acc.withdraw(700000);  // ditolak: melebihi saldo
        acc.withdraw(200000);  // berhasil, saldo jadi 300000

        System.out.println("Saldo akhir akun " + acc.getAccountNumber()
                + ": Rp" + acc.getBalance());
    }
}

