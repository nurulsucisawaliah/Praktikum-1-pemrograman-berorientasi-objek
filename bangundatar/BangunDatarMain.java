/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import mypackage.OperasiBilangan;

/**
 *
 * @author ASUS
 */
public class BangunDatarMain {
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang();
        p1.panjang = 25;
        p1.lebar = 38;
        p1.hitungLuas();
        p1.hitungKeliling();
        
        //project 2
        Persegi ps1 = new Persegi();
        ps1.sisi = 10;
        ps1.hitungLuas();
        ps1.hitungKeliling();
        
        Persegi ps2 = new Persegi();
        ps2.sisi = 15;
        ps2.hitungLuas();
        ps2.hitungKeliling();
        
        //project 2
        Lingkaran l1 = new Lingkaran();
        l1.phi = 3.14;
        l1.r = 25;
        l1.hitungLuas();
        l1.hitungKeliling();
        
        Lingkaran l2 = new Lingkaran();
        l2.phi = 3.14;
        l2.r = 37;
        l2.hitungLuas();
        l2.hitungKeliling();
    }
}
