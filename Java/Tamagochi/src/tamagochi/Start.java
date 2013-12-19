/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tamagochi;

import java.util.*;
import tamagochi.tiere.*;

/**
 *
 * @author morion
 */
class Start {
    private static int tag,stunde;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tier t1 = new Tier("Holger");
        t1.sagNamen();
//        Start.printTime();
//        for(int i=0;i<100;i++){
//            Start.tick();
//        }
    }
    private static void tick(){
        if(Start.stunde<23)
            Start.stunde++;
        else{
            Start.stunde = 0;
            Start.tag++;
        }
        Start.printTime();
    }
    private static void printTime(){
        System.out.println("Tag: "+Start.tag+"\t Stunde: "+Start.stunde);
    }
}
