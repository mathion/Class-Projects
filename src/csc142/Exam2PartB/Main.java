/*  Program draws shapes in a window
*   Created by: Ian Persson
*   Last Updated: 12/04/17
* */


package csc142.Exam2PartB;

import csc142.Exam2PartB.one.LShape;
import csc142.Exam2PartB.one.Oval;
import csc142.Exam2PartB.one.Rectangle;
import csc142.Exam2PartB.one.Shape;
import csc142.Exam2PartB.two.Circle;
import csc142.Exam2PartB.two.Square;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creates Scanner and prompts user for input

        Scanner scanner = new Scanner(System.in);

        System.out.println("What shape would you like to draw? ");
        System.out.println("Available shapes: [o]val, [c]ircle, [s]quare , [r]ectangle, [l]Shape");

        String shapeChoice = scanner.nextLine();

        System.out.println("[f]illed or [u]nfilled(default)? ");
        Boolean fillChoice = scanner.nextLine().startsWith("f");

        //Creates window shapes will be drawn on

        JFrame window = initializeWindow("Shapes", 1000);

        Shape shape;


        //Prompts user for dimensions of the shape depending on choice
        //Then draws shape in the window

        if (shapeChoice.startsWith("o")) {

            System.out.println("Diameter X? ");
            int diameterX = Integer.parseInt(scanner.nextLine());
            System.out.println("Diameter Y? ");
            int diameterY = Integer.parseInt(scanner.nextLine());

            Oval oval = new Oval(diameterX, diameterY);
            window.setVisible(true);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }

            if (fillChoice) {
                oval.drawFilled(window);
            } else {
                oval.drawUnFilled(window);
            }

            shape = oval;


        } else if (shapeChoice.startsWith("c")) {

            System.out.println("Diameter? ");
            int diameter = Integer.parseInt(scanner.nextLine());

            Circle circle = new Circle(diameter);
            window.setVisible(true);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }


            if (fillChoice) {
                circle.drawFilled(window);
            } else {
                circle.drawUnFilled(window);
            }


            shape = circle;

        } else if (shapeChoice.startsWith("s")) {

            System.out.println("Side Length?");
            int sideLength = Integer.parseInt(scanner.nextLine());

            Square square = new Square(sideLength);
            window.setVisible(true);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }

            if (fillChoice) {
                square.drawFilled(window);
            } else {
                square.drawUnFilled(window);
            }

            shape = square;

        } else if (shapeChoice.startsWith("r")) {

            System.out.println("Width?");
            int width = Integer.parseInt(scanner.nextLine());
            System.out.println("Height");
            int height = Integer.parseInt(scanner.nextLine());

            Rectangle rectangle = new Rectangle(width, height);
            window.setVisible(true);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }

            if (fillChoice) {
                rectangle.drawFilled(window);
            } else {
                rectangle.drawUnFilled(window);
            }

            shape = rectangle;

        } else if (shapeChoice.startsWith("l")) {
            System.out.println("Large Width?");
            int longWidth = Integer.parseInt(scanner.nextLine());
            System.out.println("Small Width?");
            int shortWidth = Integer.parseInt(scanner.nextLine());

            System.out.println("Large Height?");
            int longHeight = Integer.parseInt(scanner.nextLine());
            System.out.println("Small Height?");
            int shortHeight = Integer.parseInt(scanner.nextLine());

            LShape lShape = new LShape(longWidth, longHeight, shortWidth, shortHeight);
            window.setVisible(true);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }

            if (fillChoice) {
                lShape.drawFilled(window);

            } else {
                lShape.drawUnFilled(window);
            }

            shape = lShape;


        } else {
            System.out.println("Invalid Choice");
            shape = new Oval(0, 0);
            window.setVisible(true);

        }

        drawInfo(window, shape);



    }


    private static JFrame initializeWindow(String title, int size /*, int xLocation, int yLocation*/) {
        //Creates a square window with a title
        JFrame window = new JFrame(title);
        window.setSize(size, size);
//        window.setLocation(xLocation, yLocation);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(false);
//        window.getContentPane().setBackground(Color.GRAY);
        return window;
    }

    private static void drawInfo(JFrame window, Shape shape) {
        //Draws the dimensions , area and perimeter of the shape next to the shape
        String[] info = shape.getInfo().split("\n");
        for (int i = 0; i < info.length; i++) {
            window.getGraphics().drawString(info[i], shape.getXOffset() + 15, 60 + (i * 10));
        }
    }
}