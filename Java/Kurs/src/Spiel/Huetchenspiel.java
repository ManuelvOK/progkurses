/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Spiel;
import java.util.Random;

/**
 *
 * @author morion
 */
public class Huetchenspiel {
    private Huetchen[] huetchen;
    private int anzahl;
    
    public Huetchenspiel(int anzahl){
        if(anzahl<3){
            System.out.println("Zu wenig Hütchen!");
        }
        else{
            for(int i=0; i<anzahl;i++){
                this.huetchen[i] = new Huetchen();
            }
        }
    }
    public void tausche(int h1, int h2){
        if(h1 <= this.anzahl && h2 <= this.anzahl){
            Huetchen temp1 = huetchen[h1];
            Huetchen temp2 = huetchen[h2];

            huetchen[h1] = temp2;
            huetchen[h2] = temp1;
            System.out.println("Tausche Hütchen "+h1+" mit Hütchen "+h2+".");
        }
    }
    private void runde(){
        for(Huetchen element: huetchen){
            element.deleteBall();
        }
        int hball = this.rand();
        this.huetchen[hball].setBall();
        for(int i=0;i<this.anzahl;i++){
            int hrand1 = this.rand();
            int hrand2 = this.rand();
            while(hrand1 == hrand2){
                hrand2 = this.rand();
            }
        }
    }
    private int rand(){
        Random rand = new Random(); 
        return rand.nextInt(this.anzahl)+1;
    }
}
