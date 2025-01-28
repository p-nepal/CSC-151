/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pranaynepal_arearec_csc.pkg151_01;
import javax.swing.JOptionPane;

/**
 *
 * @author nepalp5175
 */
public class PranayNepal_AreaRec_CSC151_01
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double width = getWidth();
        double length = getLength();
        CalcAreaAndDisplay(width, length);
    }
   
    public static double getWidth()
    {
        // Prompt the user to enter the width of the rectangle
        String widthInput = JOptionPane.showInputDialog(null,
            "Enter the width of the rectangle:",
            "Rectangle Area Calculator",
            JOptionPane.QUESTION_MESSAGE);
           
        // Convert the input to a double
        return Double.parseDouble(widthInput);
    }
   
    public static double getLength()
    {
        // Prompt the user to enter the height of the rectangle
        String lengthInput = JOptionPane.showInputDialog(null,
            "Enter the length of the rectangle:",
            "Rectangle Area Calculator",
            JOptionPane.QUESTION_MESSAGE);
           
        // Convert the input to a double
        return Double.parseDouble(lengthInput);
    }
   
    public static void CalcAreaAndDisplay(double width, double length)
    {
        // Calculate the area of the rectangle
        double area = width * length;
        // Display the result
        JOptionPane.showMessageDialog(null,
            "The area of the rectangle is: " + area,
            "Result",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
