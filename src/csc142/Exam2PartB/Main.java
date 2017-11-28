package csc142.Exam2PartB;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = initializeWindow("Shapes", 1000);


    }


    private static JFrame initializeWindow(String title, int size /*, int xLocation, int yLocation*/) {
        JFrame window = new JFrame(title);
        window.setSize(size, size);
//        window.setLocation(xLocation, yLocation);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
//        window.getContentPane().setBackground(Color.GRAY);
        return window;
    }
}