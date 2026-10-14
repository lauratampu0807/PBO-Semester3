/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterSetter;
/* Nama: Laura Tampubolon
Nim: 41425045
*/
// Class dengan atribut private, diakses lewat getter dan setter
class GetSet {
    // private: tidak bisa diakses langsung dari luar class
    private String name;

    // Getter: mengembalikan nilai atribut name
    public String getName() {
        return name;
    }

    // Setter: mengubah nilai atribut name
    public void setName(String N) {
        this.name = N;
    }
}

public class GetterSetterContoh1 {
    public static void main(String[] args) {
        GetSet obj = new GetSet();
        // Mengisi nilai lewat setter
        obj.setName("Geeks for Geeks");
        // Mengambil nilai lewat getter
        System.out.println(obj.getName());
    }
}

