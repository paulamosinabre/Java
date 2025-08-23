
package com.mycompany.crossingchicken.Entity;

import com.mycompany.crossingchicken.GamePanel;
import com.mycompany.crossingchicken.KeyHandle;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.IOException;

public class Player extends Entity{
    //Instantiate the class para accessible siya sa player
    GamePanel gp;
    KeyHandle keyH;
    
    
    public Player(GamePanel gp, KeyHandle keyH){
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
    }
    
    public void setDefaultValues(){
        x = 420; 
        y = 400;    
    }
    
    public void getPlayerImage(){
        try {
            character = ImageIO.read(getClass().getResourceAsStream("resources/hirono.png"));
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void update(){
         if (keyH.spacePressed == true) {
            y -= 20;
            
        }
    }
    
    public void draw(Graphics2D g2){
        g2.setColor(Color.white);
        //PANOO ma-get yung variable from another package???
        //do this: field.variable
        g2.fillRect(x, y, gp.tileSize, gp.tileSize); 
    }

    
    
}
