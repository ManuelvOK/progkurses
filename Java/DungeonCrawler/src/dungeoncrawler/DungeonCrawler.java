/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dungeoncrawler;
import simple_gui.*;
/**
 *
 * @author morion
 */
public class DungeonCrawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dungeon dungeon1 = new Dungeon(100, 100);
        DrawingWindow mainframe = new DrawingWindow("DungeonCrawler - "+dungeon1.getStartRoom().getTitle());
        dungeon1.drawCurrentRoom(mainframe);
//        TextWindow text = new TextWindow();
        
    }
    
    
}
