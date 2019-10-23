/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan61;

/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public class Tester {

    /**
     * @param args
     */
      public static void main(String[] args){
        BolaBasket bolabasket = new BolaBasket();
        bolabasket.setJariJari(7);
        System.out.printf("Volume Bola Basket : " + "%.1f cm3",bolabasket.hitungVolume());
        
        Tabung tabung = new Tabung();
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        
        System.out.printf("\nVolume Tabung : " + tabung.hitungVolume() + " cm3");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJariJari(14);
        kerucut.setTinggi(10);
        
        System.out.printf("\nVolume Kerucut : " + "%.1f cm3",kerucut.hitungVolume());
    }
}