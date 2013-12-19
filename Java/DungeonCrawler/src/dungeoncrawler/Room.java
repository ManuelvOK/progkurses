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
public class Room {
    private String title;
    private Room roomNorth;
    private Room roomEast;
    private Room roomSouth;
    private Room roomWest;
    private int roomWidth;
    private int roomHeight;
    
    public Room(String title,int width,int height){
        this.title = title;
        this.roomWidth = width;
        this.roomHeight = height;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void connectNorth(Room room){
        this.roomNorth = room;
        if(room.getRoomSouth() != this){
            this.roomNorth.connectSouth(this);
        }
    }
    public void connectEast(Room room){
        this.roomEast = room;
        if(room.getRoomWest() != this){
            room.connectWest(this);
        }
    }
    public void connectSouth(Room room){
        this.roomSouth = room;
        if(room.getRoomNorth() != this){
            room.connectNorth(this);
        }
    }
    public void connectWest(Room room){
        this.roomWest = room;
        if(room.getRoomEast() != this){
            room.connectEast(this);
        }
    }
    public Room getRoomNorth(){
        return this.roomNorth;
    }
    public Room getRoomEast(){
        return this.roomEast;
    }
    public Room getRoomSouth(){
        return this.roomSouth;
    }
    public Room getRoomWest(){
        return this.roomWest;
    }
    public void draw(DrawingWindow window,int offsetx,int offsety){
        int startX,startY,endX,endY,middleX,middleY;
        startX = offsetx;
        startY = offsety;
        endX = startX+this.roomWidth;
        endY = startY+this.roomHeight;
        middleX = startX+this.roomWidth/2;
        middleY = startY+this.roomHeight/2;
        
        if(this.roomWest != null){
            window.drawLine(startX, startY, startX, middleY-10);
            window.drawLine(startX, middleY+10, startX, endY);
        }
        else{
            window.drawLine(startX, startY, startX, endY);
        }
        if(this.roomEast != null){
            window.drawLine(endX, startY, endX, middleY-10);
            window.drawLine(endX, middleY+10, endX, endY);
        }
        else{
            window.drawLine(endX, startY, endX, endY);
        }
        if(this.roomNorth != null){
            window.drawLine(startX, startY, middleX-10, startY);
            window.drawLine(middleX+10, startY, endX, startY);
        }
        else{
            window.drawLine(startX, startY, endX, startY);
        }
        if(this.roomSouth != null){
            window.drawLine(startX, endY, middleX-10, endY);
            window.drawLine(middleX+10, endY, endX, endY);
        }
        else{
            window.drawLine(startX, endY, endX, endY);
        }

        //window.drawText(60, 70, this.title);
    }
}
