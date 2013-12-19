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
public class Maus extends Tier{
    public Maus(String name){
        super(name);
    }
    public void laut(){
        if(this.getLebendig()){
            System.out.println(this.getName() + ": Quiek!");
        }
        else{
            System.out.println(this.getName()+" kann nicht mehr quiken. "+this.getName()+" ist tot.");
        }
    }
}
