/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nepalpranay_hello_goodbye_250130_01;
import javax.swing.JOptionPane;

/**
 *
 * @author nepalp5175
 */
public class NepalPranay_Hello_Goodbye_250130_01
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String shape = getShape();
        
        if ("rectangle".equals(shape)) {
            double width = getWidth();
            double length = getLength();
            CalcRecArea(width, length);
        } if ("triangle".equals(shape)) {
            double base = getBase();
            double height = getHeight();
            CalcTriArea(base, height);
        }  if ("circle".equals(shape)) {
            double radius = getRadius();
            CalcCirArea(radius);
        } else {
            giveError();
        }
    }

    public static void giveError()
    {
        JOptionPane.showMessageDialog(null,
            "Something went wrong...",
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }
     
    public static String getShape()
    {
        String getShape = JOptionPane.showInputDialog(null,
            "What shape (triangle, circle rectangle) would you like to calculate for? ",
            " Area Calculator",
            JOptionPane.QUESTION_MESSAGE);
        return getShape;
    }
   
    public static double getWidth()
    {
        String widthInput = JOptionPane.showInputDialog(null,
            "Enter the width of the rectangle:",
            "Rectangle Area Calculator",
            JOptionPane.QUESTION_MESSAGE);
        return Double.parseDouble(widthInput);
    }
   
    public static double getLength()
    {
        String lengthInput = JOptionPane.showInputDialog(null,
            "Enter the length of the rectangle:",
            "Rectangle Area Calculator",
            JOptionPane.QUESTION_MESSAGE);
        return Double.parseDouble(lengthInput);
    }
   
    public static void CalcRecArea(double width, double length)
    {
        double area = width * length;
        JOptionPane.showMessageDialog(null,
            "The area of the rectangle is: " + area,
            "Result",
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static double getBase()
    {
        String baseInput = JOptionPane.showInputDialog(null,
            "Enter the base of the triangle:",
            "Triangle Area Calculator",
            JOptionPane.QUESTION_MESSAGE);
        return Double.parseDouble(baseInput);
    }
    
    public static double getHeight()
    {
        String heightInput = JOptionPane.showInputDialog(null,
            "Enter the height of the triangle:",
            "Triangle Area Calculator",
            JOptionPane.QUESTION_MESSAGE);
        return Double.parseDouble(heightInput);
    }
    
    public static void CalcTriArea(double base, double height)
    {
        double area = (base * height) / 2;
        JOptionPane.showMessageDialog(null,
            "The area of the triangle is: " + area,
            "Result",
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static double getRadius()
    {
        String radiusInput = JOptionPane.showInputDialog(null,
            "Enter the radius of the circle:",
            "Circle Area Calculator",
            JOptionPane.QUESTION_MESSAGE);
        return Double.parseDouble(radiusInput);
    }
    
    public static void CalcCirArea(double radius)
    {
        double pi = 3.14;
        double area = radius * radius * pi;
        JOptionPane.showMessageDialog(null,
            "The area of the circle is: " + area,
            "Result",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
