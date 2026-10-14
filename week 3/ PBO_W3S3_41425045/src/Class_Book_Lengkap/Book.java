/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Book_Lengkap;

/* Nama: Laura Tampubolon
Nim: 41425045
*/
public class Book implements Cloneable {
    private String t;
    private String a;
    private int y;

    public Book(String t, String a, int y) {
        this.t = t;
        this.a = a;
        this.y = y;
    }

    @Override
    public String toString() {
        return t + " by " + a + " (" + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Book)) {
            return false;
        }
        Book other = (Book) o;
        return this.t.equals(other.getTitle())
                && this.a.equals(other.getAuthor())
                && this.y == other.getYear();
    }

    @Override
    public int hashCode() {
        int res = 17;
        res = 31 * res + t.hashCode();
        res = 31 * res + a.hashCode();
        res = 31 * res + y;
        return res;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing " + this);
    }

    public String getTitle() { return t; }
    public String getAuthor() { return a; }
    public int getYear() { return y; }

    public static void main(String[] args) {
        Book bl = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979);
        System.out.println(bl);
        Book b2 = bl.clone();
        System.out.println(b2);
        System.out.println("bl equals b2: " + bl.equals(b2));
        System.out.println("bl hash code: " + bl.hashCode());
        System.out.println("b2 hash code: " + b2.hashCode());
        bl = null;
        System.gc();
    }
}
