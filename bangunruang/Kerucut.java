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
public class Kerucut {
    //atribut
    public double r;
    double phi=3.14;
    public double t;
    public double s;
    
    //method
    public void hitungVolume(){
        double volume;
	volume = 0.3*phi*(r*r)*t;
        System.out.println("Volume kerucut adalah : " + volume);
    }
    public void hitungLuasSelimut(){
        double luas;
	luas = phi*r*s;
        System.out.println("luas selimut kerucut adalah : " + luas);
    }
}
