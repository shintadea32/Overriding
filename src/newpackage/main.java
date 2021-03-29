/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author I d e a P a d
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek untuk memanggil method di class induk
        induk objek = new induk();
        //membuat objek untuk memanggil method di class anak
        anak objek1 = new anak();
        //membuat objek untuk memanggil method yang memiliki judul sama, namun class berbeda
        induk objek2 = new anak();
        
        //objek2 menggunakan method nama
        objek2.nama();
        //objek menggunakan method nama
        objek.nama();
        //objek menggunakan method nik
        objek.nik();
        //objek menggunakan method ttl
        objek.ttl();
        //objek menggunakan method jeniskel
        objek.jeniskel();
        //objek menggunakan method agama
        objek.agama();
        
    }
    
}
