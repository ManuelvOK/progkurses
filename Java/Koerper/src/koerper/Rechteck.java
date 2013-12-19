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
public class Rechteck {
    private int laenge;
    private int breite;
    
    public Rechteck(){
        this.laenge = 1;
        this.breite = 1;
    }
    public Rechteck(int laenge, int breite){
        this.laenge = laenge;
        this.breite = breite;
    }
    public int getLaenge(){
        return this.laenge;
    }
    public int getBreite(){
        return this.breite;
    }
    public void setLaenge(int laenge){
        this.laenge = laenge;
    }
    public void setBreite(int breite){
        this.breite = breite;
    }
    public int getFlaeche(){
        return this.getBreite()*this.getLaenge();
    }
    public String toString(){
        return "Dies ist ein Rechteck mit der Länge "+this.getLaenge()+", der Breite "+this.getBreite()+" und dem Flächeninhalt "+this.getFlaeche();
    }
}
