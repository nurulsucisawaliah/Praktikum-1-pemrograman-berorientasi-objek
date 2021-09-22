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
public class Lingkaran {
    // atribut
    public double r;
    public double luas;
    public double keliling;
    double phi=3.14;
    // method
    public void hitungLuas(){
        double hasil;
	hasil = phi*(r *r);
        System.out.println("Luas lingkaran adalah : " + hasil);
    }
    
    public void hitungKeliling(){
        double hasil;
	hasil = 2*phi*r;
        System.out.println("keliling lingkaran adalah : " + hasil);
    }
}
