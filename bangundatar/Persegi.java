/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ASUS
 */
public class Persegi {
    // atribut
    int sisi;
    
    //method
    void hitungLuas(){
        int luas;
        luas = this.sisi * this.sisi;
        /*this sisi adalah perintah untuk mengakases/ mengambil 
        atribut sisi dari class itu sendiri*/
        System.out.println("Luas Persegi  adalah : " + luas + "satuan luas");
    }
    
    void hitungKeliling(){
        int keliling;
        keliling = 4 * this.sisi;
        System.out.println("Keliling persegi adalah : " + keliling);
    }
}
