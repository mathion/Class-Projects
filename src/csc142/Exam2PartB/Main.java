package csc142.Exam2PartB;

import csc142.Exam2PartB.one.LShape;
import csc142.Exam2PartB.one.Oval;
import csc142.Exam2PartB.one.Rectangle;
import csc142.Exam2PartB.two.Circle;
import csc142.Exam2PartB.two.Square;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.RecursiveAction;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What shape would you like to draw? ");
        System.out.println("Available shapes: [o]val, [c]ircle, [s]quare , [r]ectangle, [l]Shape");

        String shapeChoice = scanner.nextLine();

        System.out.println("[f]illed or [u]nfilled(default)? ");
        Boolean fillChoice = scanner.nextLine().startsWith("f");

        JFrame window = initializeWindow("Shapes", 1000);


        if (shapeChoice.startsWith("o")) {

            System.out.println("Radius X? ");
            int radiusX = Integer.parseInt(scanner.nextLine());
            System.out.println("Radius Y? ");
            int radiusY = Integer.parseInt(scanner.nextLine());

            Oval oval = new Oval(radiusX, radiusY);

            if (fillChoice) {
                window.getGraphics().fillOval(10, 50, oval.getRadiusX(), oval.getRadiusY());
            } else {
                window.getGraphics().drawOval(10, 50, oval.getRadiusX(), oval.getRadiusY());
            }

            window.getGraphics().drawString("Radius X = " + oval.getRadiusX(), 10 + oval.getRadiusX(), 50);
            window.getGraphics().drawString("Radius y = " + oval.getRadiusY(), 10 + oval.getRadiusX(), 60);
            window.getGraphics().drawString("Area = " + oval.getArea(), 10 + oval.getRadiusX(), 70);
            window.getGraphics().drawString("Perimeter = " + oval.getPerimeter(), 10 + oval.getRadiusX(), 80);


        } else if (shapeChoice.startsWith("c")) {

            System.out.println("Radius? ");
            int radius = Integer.parseInt(scanner.nextLine());
            Circle circle = new Circle(radius);

            if (fillChoice) {
                window.getGraphics().fillOval(10, 50, circle.getRadiusX(), circle.getRadiusY());
            } else {
                window.getGraphics().drawOval(10, 50, circle.getRadiusX(), circle.getRadiusY());
            }

            window.getGraphics().drawString("Radius = " + circle.getRadiusX(), 10 + circle.getRadiusX(), 50);
            window.getGraphics().drawString("Area = " + circle.getArea(), 10 + circle.getRadiusX(), 70);
            window.getGraphics().drawString("Perimeter = " + circle.getPerimeter(), 10 + circle.getRadiusX(), 80);


        } else if (shapeChoice.startsWith("s")) {

            System.out.println("Side Length?");
            int sideLength = Integer.parseInt(scanner.nextLine());

            Square square = new Square(sideLength);

            if (fillChoice) {
                window.getGraphics().fillRect(10, 50, square.getWidth(), square.getHeight());
            } else {
                window.getGraphics().drawRect(10, 50, square.getWidth(), square.getHeight());
            }

            window.getGraphics().drawString("Side Length = " + square.getWidth(), 15 + square.getWidth(), 50);
            window.getGraphics().drawString("Area = " + square.getArea(), 15 + square.getWidth(), 70);
            window.getGraphics().drawString("Perimeter = " + square.getPerimeter(), 15 + square.getWidth(), 80);


        } else if (shapeChoice.startsWith("r")) {

            System.out.println("Width?");
            int width = Integer.parseInt(scanner.nextLine());
            System.out.println("Height");
            int height = Integer.parseInt(scanner.nextLine());

            Rectangle rectangle = new Rectangle(width, height);

            if (fillChoice) {
                window.getGraphics().fillRect(10, 50, rectangle.getWidth(), rectangle.getHeight());
            } else {
                window.getGraphics().drawRect(10, 50, rectangle.getWidth(), rectangle.getHeight());
            }

            window.getGraphics().drawString("Width = " + rectangle.getWidth(), 15 + rectangle.getWidth(), 50);
            window.getGraphics().drawString("Height = " + rectangle.getHeight(), 15 + rectangle.getWidth(), 60);
            window.getGraphics().drawString("Area = " + rectangle.getArea(), 15 + rectangle.getWidth(), 70);
            window.getGraphics().drawString("Perimeter = " + rectangle.getPerimeter(), 15 + rectangle.getWidth(), 80);


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
                window.getGraphics().fillRect(10, 50, lShape.getShortWidth(), lShape.getLongHeight());
                window.getGraphics().fillRect(
                        10,
                        50 + lShape.getLongHeight() - lShape.getShortHeight(),
                        lShape.getLongWidth(),
                        lShape.getShortHeight());
            } else {
                window.getGraphics().drawRect(10, 50, lShape.getShortWidth(), lShape.getLongHeight());
                window.getGraphics().drawRect(
                        10 + lShape.getShortWidth(),
                        50 + lShape.getLongHeight() - lShape.getShortHeight(),
                        lShape.getLongWidth() - lShape.getShortWidth(),
                        lShape.getShortHeight());
            }

            window.getGraphics().drawString("Large Width = " + lShape.getLongWidth(), lShape.getLongWidth(), 50);
            window.getGraphics().drawString("Large Height = " + lShape.getLongHeight(), lShape.getLongWidth(), 60);
            window.getGraphics().drawString("Small Width = " + lShape.getShortWidth(), lShape.getLongWidth(), 70);
            window.getGraphics().drawString("Small Height = " + lShape.getShortHeight(), lShape.getLongWidth(), 80);
            window.getGraphics().drawString("Area = " + lShape.getArea(), lShape.getLongWidth(), 90);
            window.getGraphics().drawString("Perimeter = " + lShape.getPerimeter(), lShape.getLongWidth(), 100);


        } else {
            System.out.println("Invalid Choice");

        }


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