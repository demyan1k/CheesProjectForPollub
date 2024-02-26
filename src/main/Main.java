package main;

import javax.swing.JFrame;

public class Main{

    public static void main(String[] args) {

        JFrame window = new JFrame("Chees");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        //add gamepanel to the window;
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();
    }
}