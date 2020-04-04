/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4_kel02_method;

/**
 *
 * @author ASUS
 */
public class Modul4_kel02_method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pendefinisi objek = new pendefinisi();
objek.greeting();
objek.kelompok("Kelompok 2");
String print = objek.kenalan("Erika", "Baca Novel");
System.out.println(print);
    }
    
}
