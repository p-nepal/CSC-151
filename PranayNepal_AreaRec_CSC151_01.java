/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nepalpranay_area_perimeter_calculator_250130_01;
import javax.swing.*;

/**
 *
 * @author nepalp5175
 */

public class NepalPranay_Area_Perimeter_Calculator_250130_01 {

    public static void main(String[] args) {
        String shape = getShape(); // Show dropdown for shape selection
        
        // Switch statement for selecting the shape
        switch (shape.toLowerCase()) {
            case "rectangle" -> {
                double width = getWidth();
                double length = getLength();
                CalcRecArea(width, length);
            }

            case "square" -> {
                double side = getSide();
                CalcSquareArea(side);
            }

            case "parallelogram" -> {
                double base = getBase();
                double height = getHeight();
                CalcParallelogramArea(base, height);
            }

            case "triangle" -> {
                double triBase = getBase();
                double triHeight = getHeight();
                CalcTriArea(triBase, triHeight);
            }

            case "circle" -> {
                double radius = getRadius();
                CalcCirArea(radius);
            }

            case "ellipse" -> {
                double a = getEllipseA();
                double b = getEllipseB();
                CalcEllipseArea(a, b);
            }

            case "trapezoid" -> {
                double base1 = getTrapezoidBase1();
                double base2 = getTrapezoidBase2();
                double trapHeight = getTrapezoidHeight();
                CalcTrapezoidArea(base1, base2, trapHeight);
            }

            case "rhombus" -> {
                double diag1 = getRhombusDiagonal1();
                double diag2 = getRhombusDiagonal2();
                CalcRhombusArea(diag1, diag2);
            }

            case "sector of circle" -> {
                double sectorRadius = getRadius();
                double angle = getSectorAngle();
                CalcSectorArea(sectorRadius, angle);
            }

            case "regular polygon" -> {
                int n = getNumSides();
                double s = getSide();
                CalcRegularPolygonArea(n, s);
            }

            default -> giveError("Invalid shape entered.");
        }
    }

    public static void giveError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static String getShape() {
        String[] shapes = {"Rectangle", "Square", "Parallelogram", "Triangle", "Circle", "Ellipse", "Trapezoid", "Sector of Circle", "Rhombus", "Regular Polygon"};
        String shape = (String) JOptionPane.showInputDialog(null,
            "Select a shape to calculate the area for:",
            "Shape Selection",
            JOptionPane.QUESTION_MESSAGE,
            null,
            shapes,
            shapes[0]); // Default selection is Rectangle
        return shape;
    }

    // Methods for each shape
    public static double getWidth() {
        return getPositiveDouble("Enter the width of the rectangle:");
    }

    public static double getLength() {
        return getPositiveDouble("Enter the length of the rectangle:");
    }

    public static double getSide() {
        return getPositiveDouble("Enter the side length:");
    }

    public static double getBase() {
        return getPositiveDouble("Enter the base:");
    }

    public static double getHeight() {
        return getPositiveDouble("Enter the height:");
    }

    public static double getRadius() {
        return getPositiveDouble("Enter the radius:");
    }

    public static double getEllipseA() {
        return getPositiveDouble("Enter the semi-major axis of the ellipse:");
    }

    public static double getEllipseB() {
        return getPositiveDouble("Enter the semi-minor axis of the ellipse:");
    }

    public static double getTrapezoidBase1() {
        return getPositiveDouble("Enter the length of the first base of the trapezoid:");
    }

    public static double getTrapezoidBase2() {
        return getPositiveDouble("Enter the length of the second base of the trapezoid:");
    }

    public static double getTrapezoidHeight() {
        return getPositiveDouble("Enter the height of the trapezoid:");
    }

    public static double getRhombusDiagonal1() {
        return getPositiveDouble("Enter the first diagonal of the rhombus:");
    }

    public static double getRhombusDiagonal2() {
        return getPositiveDouble("Enter the second diagonal of the rhombus:");
    }

    public static double getSectorAngle() {
        return getPositiveDouble("Enter the central angle (in degrees) of the sector:");
    }

    public static int getNumSides() {
        String input = JOptionPane.showInputDialog(null, "Enter the number of sides of the regular polygon:");
        return Integer.parseInt(input);
    }

    // Method to get positive numbers
    public static double getPositiveDouble(String prompt) {
        double value = -1;
        while (value <= 0) {
            try {
                String input = JOptionPane.showInputDialog(null, prompt, "Input", JOptionPane.QUESTION_MESSAGE);
                value = Double.parseDouble(input);
                if (value <= 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a positive value.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return value;
    }

    // Helper function to format the area to 5 decimal places
    public static String formatArea(double area) {
        return String.format("%.5f", area);
    }

    // Calculation Methods for each shape with units, rounded to 5 decimal places
    public static void CalcRecArea(double width, double length) {
        double area = width * length;
        JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + formatArea(area) + " square units.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void CalcSquareArea(double side) {
        double area = side * side;
        JOptionPane.showMessageDialog(null, "The area of the square is: " + formatArea(area) + " square units.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void CalcParallelogramArea(double base, double height) {
        double area = base * height;
        JOptionPane.showMessageDialog(null, "The area of the parallelogram is: " + formatArea(area) + " square units.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void CalcTriArea(double base, double height) {
        double area = (base * height) / 2;
        JOptionPane.showMessageDialog(null, "The area of the triangle is: " + formatArea(area) + " square units.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void CalcCirArea(double radius) {
        double area = Math.PI * radius * radius;
        JOptionPane.showMessageDialog(null, "The area of the circle is: " + formatArea(area) + " square units.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void CalcEllipseArea(double a, double b) {
        double area = Math.PI * a * b;
        JOptionPane.showMessageDialog(null, "The area of the ellipse is: " + formatArea(area) + " square units.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void CalcTrapezoidArea(double base1, double base2, double height) {
        double area = (base1 + base2) / 2 * height;
        JOptionPane.showMessageDialog(null, "The area of the trapezoid is: " + formatArea(area) + " square units.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void CalcRhombusArea(double diag1, double diag2) {
        double area = (diag1 * diag2) / 2;
        JOptionPane.showMessageDialog(null, "The area of the rhombus is: " + formatArea(area) + " square units.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void CalcSectorArea(double radius, double angle) {
        double area = (angle / 360) * Math.PI * radius * radius;
        JOptionPane.showMessageDialog(null, "The area of the sector is: " + formatArea(area) + " square units.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void CalcRegularPolygonArea(int n, double s) {
        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
        JOptionPane.showMessageDialog(null, "The area of the regular polygon is: " + formatArea(area) + " square units.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
