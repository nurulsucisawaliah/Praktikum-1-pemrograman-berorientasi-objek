/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class Bola {
    //atribut
    public double r;
    double phi=3.14;
    
    //method
    public void hitungVolume(){
        double volume;
	volume = 1.3*phi*(r*r*r);
        System.out.println("Volume bola adalah : " + volume);
    }
    public void hitungLuasSelimut(){
        double luas;
	luas = 4*phi*(r*r);
        System.out.println("luas selimut bola adalah : " + luas);
    }
}
