/*
Draws a set of nine dots in a new window in 6 different patterns in red white and blue
 */
package Exam1;


import javax.swing.*;
import java.awt.*;

public class SimpleScreenSaver {
    public static void main(String[] args) {

        int size = 600;
//        int xPosition = 0;
//        int yPosition = 0;
        String title = "Simple Screen Saver";
//        JFrame[] windows = new JFrame[6];
        JFrame window = initializeWindow(title, size /*, xPosition, yPosition */);


        Graphics gObject = window.getGraphics();

        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }

        Container contentPane = window.getContentPane();

//        Color[] colors = {Color.RED, Color.WHITE, Color.BLUE};
        Color red = Color.RED;
        Color white = Color.WHITE;
        Color blue = Color.BLUE;


        //draws the circles in six patterns using the three colors

        drawCrossPatternNoLoop(contentPane, blue, red);
        drawXPatternNoLoop(contentPane, white, red);
        drawCrossPatternNoLoop(contentPane, white, blue);
        drawCrossPatternNoLoop(contentPane, blue, white);
        drawXPatternNoLoop(contentPane, blue, red);
        drawXPatternNoLoop(contentPane, red, white);


//        for (int i = 0; i < 6; i++) {
//
//            JFrame temp = initializeWindow(
//                    title + " " + i,
//                    size,
//                    xPosition + (size+100) * (i % 3),
//                    yPosition + size * (i % 2)
//            );
//            windows[i] = temp;
//        }

//        for (int i=0;i<3;i++){
//            drawCrossPattern(windows[i],colors[i%3],colors[(i+1)%3]);
//            drawXPattern(windows[i+3],colors[i%3],colors[(i+1)%3]);
//        }


    }

    //Returns a new JFrame of size size X size with predetermined settings
    private static JFrame initializeWindow(String title, int size /*, int xLocation, int yLocation*/) {
        JFrame window = new JFrame(title);
        window.setSize(size, size);
//        window.setLocation(xLocation, yLocation);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.getContentPane().setBackground(Color.GRAY);
        return window;

    }

//    private static void drawXPattern(JFrame window, Color color1, Color color2) {
//        Graphics gObject = window.getGraphics();
//        int windowHeight = window.getHeight();
//        int windowWidth = window.getWidth();
//        Color[] colors = {color1, color2};
//        for (int i = 0; i < 9; i++) {
//            gObject.setColor(colors[i % 2]);
//            try {
//                Thread.sleep(30);
//            } catch (Exception e) {
//            }
//            gObject.fillOval(windowWidth * (7 - 3 * (i % 3)) / 10, windowHeight * (7 - 3 * (i / 3)) / 10, windowWidth / 5, windowHeight / 5);
//            try {
//                Thread.sleep(30);
//            } catch (Exception e) {
//            }
//        }
//    }
//
//    private static void drawCrossPattern(JFrame window, Color color1, Color color2) {
//        Graphics gObject = window.getGraphics();
//        int windowHeight = window.getHeight();
//        int windowWidth = window.getWidth();
//        Color[] colors = {color1, color2};
//        for (int i = 0; i < 9; i++) {
//            gObject.setColor(colors[i % 2]);
//            if (i == 4) {
//                gObject.setColor(colors[1]);
//            }
//            try {
//                Thread.sleep(30);
//            } catch (Exception e) {
//            }
//
//            gObject.fillOval(
//                    windowWidth * (7 - 3 * (i % 3)) / 10,
//                    windowHeight * (7 - 3 * (i / 3)) / 10,
//                    windowWidth / 5,
//                    windowHeight / 5);
//
//            try {
//                Thread.sleep(30);
//            } catch (Exception e) {
//            }
//
//        }
//    }

    //Draws an x pattern with the x in color 1 and the other dots in color2
    private static void drawXPatternNoLoop(Container contentPane, Color color1, Color color2) {
        Graphics gObject = contentPane.getGraphics();
        int windowHeight = contentPane.getHeight();
        int windowWidth = contentPane.getWidth();

        //Draws the x

        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }

        gObject.setColor(color1);

        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }

        gObject.fillOval(7 * windowWidth / 10, 7 * windowHeight / 10, windowWidth / 5, windowHeight / 5);

        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }

        gObject.fillOval(1 * windowWidth / 10, 7 * windowHeight / 10, windowWidth / 5, windowHeight / 5);

        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }

        gObject.fillOval(4 * windowWidth / 10, 4 * windowHeight / 10, windowWidth / 5, windowHeight / 5);

        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }

        gObject.fillOval(7 * windowWidth / 10, 1 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(1 * windowWidth / 10, 1 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }

        //Sets the color to color2 and draws remaining dots

        gObject.setColor(color2);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(4 * windowWidth / 10, 1 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(7 * windowWidth / 10, 4 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(1 * windowWidth / 10, 4 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(4 * windowWidth / 10, 7 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }


    }

    //Draws an cross pattern with the cross in color2 and the other dots in color1
    private static void drawCrossPatternNoLoop(Container contentPane, Color color1, Color color2) {
        Graphics gObject = contentPane.getGraphics();
        int windowHeight = contentPane.getHeight();
        int windowWidth = contentPane.getWidth();
        //Draws outside dots
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.setColor(color1);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(7 * windowWidth / 10, 7 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(1 * windowWidth / 10, 7 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(7 * windowWidth / 10, 1 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(1 * windowWidth / 10, 1 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }

        //Switches colors and draws the cross
        gObject.setColor(color2);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(4 * windowWidth / 10, 1 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(7 * windowWidth / 10, 4 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(1 * windowWidth / 10, 4 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(4 * windowWidth / 10, 7 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        gObject.fillOval(4 * windowWidth / 10, 4 * windowHeight / 10, windowWidth / 5, windowHeight / 5);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }


    }

}
