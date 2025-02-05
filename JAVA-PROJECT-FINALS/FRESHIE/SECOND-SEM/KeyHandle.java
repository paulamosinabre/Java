
package com.mycompany.crossingchicken;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandle implements KeyListener {
    public boolean spacePressed;
   
    public void keyTyped(KeyEvent e){
        
    }
    
    public void keyPressed(KeyEvent e){
        int code = e.getKeyCode(); // get uni code for space bar
        
        if(code == KeyEvent.VK_SPACE){
            spacePressed = true;
            
        }
    }
    
    public void keyReleased(KeyEvent e){
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_SPACE){
            spacePressed = false;
            
        }
    }
}