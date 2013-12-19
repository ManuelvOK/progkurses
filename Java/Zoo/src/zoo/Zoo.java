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
public class Zoo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Katze minka = new Katze("Minka");
        Maus lilli = new Maus("Lilli");
        Maus lolli = new Maus("Lolli");
        
        minka.laut();
        lilli.laut();
        lolli.laut();
        
        minka.schlafen();
        minka.mausEssen(lolli);
        lolli.laut();
        minka.mausEssen(lilli);
    }
    
}
