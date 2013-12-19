/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dungeoncrawler;
import java.util.*;
import simple_gui.*;
/**
 *
 * @author morion
 */
public class Dungeon {
    private int roomWidth;
    private int roomHeight;
    private Room startRoom;
    private Room currentRoom;
    public Dungeon(int width, int height){
        this.roomWidth = width;
        this.roomHeight = height;
        List<Room> roomlist = new ArrayList<Room>();
        roomlist.add(new Room("Los gehts",this.roomWidth,this.roomHeight));
        roomlist.add(new Room("not your Room",this.roomWidth,this.roomHeight));
        roomlist.add(new Room("Defenitively not your Room",this.roomWidth,this.roomHeight));
        roomlist.add(new Room("Maybe this one",this.roomWidth,this.roomHeight));
        roomlist.add(new Room("Let's do this!",this.roomWidth,this.roomHeight));
        this.startRoom = roomlist.get(0);
        roomlist.get(0).connectNorth(roomlist.get(1));
        roomlist.get(0).connectEast(roomlist.get(2));
        roomlist.get(0).getRoomEast().connectSouth(roomlist.get(3));
        roomlist.get(0).connectWest(roomlist.get(4));
        this.currentRoom = roomlist.get(0);
    }
    public Room getStartRoom(){
        return this.startRoom;
    }
    public Room getCurrentRoom(){
        return this.currentRoom;
    }
    public void drawCurrentRoom(DrawingWindow window){
        window.clear();
        this.currentRoom.draw(window,this.roomWidth+10,this.roomHeight+10);
        if(this.currentRoom.getRoomNorth() != null){
            this.currentRoom.getRoomNorth().draw(window, this.roomWidth+10, 10);
        }
        if(this.currentRoom.getRoomEast() != null){
            this.currentRoom.getRoomEast().draw(window, 2*this.roomWidth+10, this.roomHeight+10);
        }
        if(this.currentRoom.getRoomSouth() != null){
            this.currentRoom.getRoomSouth().draw(window, this.roomWidth+10, 2*this.roomHeight+10);
        }
        if(this.currentRoom.getRoomWest() != null){
            this.currentRoom.getRoomWest().draw(window, 10, this.roomHeight+10);
        }
    }
}
