/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_toString;

/* Nama: Laura Tampubolon
Nim: 41425045
*/
public class Student {
    @Override
    public String toString() {
        return "Student object";
    }

    public static void main(String[] args) {
        Student s = new Student(); //membuat objek di strudent
        System.out.println(s.toString()); //membuat to string()
    }
}
