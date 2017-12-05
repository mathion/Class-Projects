package csc142.Exam2PartB;

import csc142.Exam2PartB.one.LShape;
import csc142.Exam2PartB.one.Oval;
import csc142.Exam2PartB.one.Rectangle;
import csc142.Exam2PartB.one.Shapes;
import csc142.Exam2PartB.two.Circle;
import csc142.Exam2PartB.two.Square;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What shape would you like to draw? ");
        System.out.println("Available shapes: [o]val, [c]ircle, [s]quare , [r]ectangle, [l]Shape");

        String shapeChoice = scanner.nextLine();

        System.out.println("[f]illed or [u]nfilled(default)? ");
        Boolean fillChoice = scanner.nextLine().startsWith("f");

        JFrame window = initializeWindow("Shapes", 1000);

        Shapes shape;


        if (shapeChoice.startsWith("o")) {

            System.out.println("Radius X? ");
            int radiusX = Integer.parseInt(scanner.nextLine());
            System.out.println("Radius Y? ");
            int radiusY = Integer.parseInt(scanner.nextLine());

            Oval oval = new Oval(radiusX, radiusY);

            if (fillChoice) {
                oval.drawFilled(window);
            } else {
                oval.drawUnFilled(window);
            }

            shape = oval;


        } else if (shapeChoice.startsWith("c")) {

            System.out.println("Radius? ");
            int radius = Integer.parseInt(scanner.nextLine());
            Circle circle = new Circle(radius);

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

            if (fillChoice) {
                lShape.drawFilled(window);

            } else {
                lShape.drawUnFilled(window);
            }

            shape = lShape;


        } else {
            System.out.println("Invalid Choice");
            shape = new Oval(0, 0);
        }

        drawInfo(window, shape);


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

    private static void drawInfo(JFrame window, Shapes shape) {
        String[] info = shape.getInfo().split("\n");
        for (int i = 0; i < info.length; i++) {
            window.getGraphics().drawString(info[i], shape.getXOffset() + 15, 60 + (i * 10));
        }
    }
}