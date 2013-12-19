/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zoo;

/**
 *
 * @author morion
 */
public class Tier {
    private String name;
    private boolean hunger;
    private boolean lebendig;
    
    public Tier(String name){
        this.name = name;
        this.hunger = false;
        this.lebendig = true;
    }
    public void die(){
        this.lebendig = false;
        System.out.println(this.getName()+" ist gestorben. Der ganze Zoo weint und alle kleinkinder rennen nach Hause.");
    }
    public String getName(){
        return this.name;
    }
    public boolean getHunger(){
        return this.hunger;
    }
    public void setHunger(boolean hunger){
        this.hunger = hunger;
    }
    public boolean getLebendig(){
        return this.lebendig;
    }
}
