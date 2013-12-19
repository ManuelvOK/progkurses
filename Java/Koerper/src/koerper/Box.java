/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package koerper;

/**
 *
 * @author morion
 */
public class Box extends Rechteck{
    private int hoehe;
    
    public Box(){
        super(0,0);
        this.hoehe = 0;
    }
    public Box(int laenge, int breite, int hoehe){
        super(laenge,breite);
        this.hoehe = hoehe;
    }
    
    public void setHoehe(int hoehe){
        this.hoehe = hoehe;
    }
    public int getHoehe(){
        return this.hoehe;
    }
    public int getVolumen(){
        return super.getFlaeche()*this.getHoehe();
    }
    public String toString(){
        return "Dies ist eine Box mit der Länge "+this.getLaenge()+", der Breite "+this.getBreite()+", der Höhe"+this.getHoehe()+" und dem Volumen "+this.getVolumen();
    }
}
