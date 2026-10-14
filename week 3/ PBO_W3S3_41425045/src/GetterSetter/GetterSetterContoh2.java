/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterSetter;
/* Nama: Laura Tampubolon
Nim: 41425045
*/
// Class dengan setter yang memvalidasi nilai masukan
class GetSetNumber {
    private int num;

    // Setter: hanya menerima angka 1 sampai 10
    public void setNumber(int number) {
        if (number < 1 || number > 10) {
            // Nilai di luar rentang ditolak dengan exception
            throw new IllegalArgumentException();
        }
        num = number;
    }

    // Getter: mengembalikan nilai num
    public int getNumber() {
        return num;
    }
}

public class GetterSetterContoh2 {
    public static void main(String[] args) {
        GetSetNumber obj = new GetSetNumber();
        obj.setNumber(5); // nilai valid
        System.out.println(obj.getNumber());
    }
}

