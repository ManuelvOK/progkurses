/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Spiel;

/**
 *
 * @author morion
 */
public class Huetchen {
    private boolean ball;
    public boolean getBall(){
        return this.ball;
    }
    public void setBall(){
        this.ball = true;
    }
    public void deleteBall(){
        this.ball = false;
    }
}
