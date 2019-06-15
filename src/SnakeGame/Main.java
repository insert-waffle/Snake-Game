/*
 * Copyright 20019 (C) Jens Maes
 * 
 * Created on : 20/05/2019
 * Author     : Jens Maes
 *
*/
package SnakeGame;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Jens Maes
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Gameplay gameplay = new Gameplay();
        frame.setTitle("Snake 2019");
        frame.setBounds(10, 10, 905, 700);
        frame.setBackground(Color.WHITE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameplay);
    }
}
