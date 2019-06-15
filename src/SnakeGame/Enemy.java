/*
 * Copyright 20019 (C) Jens Maes
 * 
 * Created on : 20/05/2019
 * Author     : Jens Maes
 *
*/
package SnakeGame;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Jens
 */
public class Enemy {

    private int xposEnemy;
    private int yposEnemy;
    private Image enemyImage;

    public Enemy() {
        enemyImage = new ImageIcon(getClass().getResource("Assets/enemy.png")).getImage();
    }

    public int getXposEnemy() {
        return xposEnemy;
    }

    public void setXposEnemy(int xposEnemy) {
        this.xposEnemy = xposEnemy;
    }

    public int getYposEnemy() {
        return yposEnemy;
    }

    public void setYposEnemy(int yposEnemy) {
        this.yposEnemy = yposEnemy;
    }

    public Image getEnemyImage() {
        return enemyImage;
    }

    public void setEnemyImage(Image enemyImage) {
        this.enemyImage = enemyImage;
    }
    
    

}
