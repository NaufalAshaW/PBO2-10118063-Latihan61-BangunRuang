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
public class BolaBasket implements BangunRuang {
    private int jariJari;

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungVolume(){
        return 4.0/3.0 * 22.0/7.0 * Math.pow(jariJari, 3);
    }
    
}
