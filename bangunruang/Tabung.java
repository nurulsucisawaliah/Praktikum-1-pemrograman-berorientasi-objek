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
public class Tabung {
    //atribut
    public double r;
    double phi=3.14;
    public double t;
    //method
    public void hitungVolume(){
        double volume;
	volume = phi*(r*r)*t;
        System.out.println("Volume tabung adalah : " + volume);
    }
    public void hitungLuasSelimut(){
        double luas;
	luas = 2*phi*r*t;
        System.out.println("luas selimut tabung adalah : " + luas);
    }
}
