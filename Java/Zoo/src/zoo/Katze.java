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
public class Katze extends Tier{
    public Katze(String name){
        super(name);
    }
    public void laut(){
        System.out.println(this.getName() + ": Miau!");
    }
    public void schlafen(){
        super.setHunger(true);
        System.out.println(this.getName()+" macht ein Nickerchen.");
        System.out.println(this.getName()+" hat nun Hunger.");
    }
    public void mausEssen(Maus maus){
        if(this.getHunger() == true){
            System.out.println(this.getName()+" isst "+maus.getName());
            maus.laut();
            maus.die();
            System.gc();
            this.setHunger(false);
            System.out.println(this.getName()+" ist wieder Satt");
        }
        else{
            System.out.println(this.getName()+" hat gerade keinen Hunger auf Mäuse. Erst recht nicht auf "+maus.getName());
        }
    }
}
