/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.faytechcc.edu.numberprocessor;

// JOptionPane
import javax.swing.JOptionPane;

/**
 *
 * @author nepalp5175
 */
public class NumberProcessor
{
    /**
     * Processes a string input and attempts to convert it to an integer.
     * This method demonstrates basic input validation and error handling.
     * 
     * Things to consider:
     * 1. What should happen if the user enters nothing?
     * 2. What should happen if the user enters "abc"?
     * 3. What should happen if the user enters "3.14"?
     * 
     * @param input The string that should be converted to an integer
     * @return A message describing what happened during processing
     */
    public Integer process(String input)
    {
        // -1 means error in this program
        Integer value = -1;
        
        try {
            // convert string to integer
            value = Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            System.err.println(input + "is not an Integer!");
        }
        return value;
    }

    public static void main(String[] args)
    {
        // bake the class into an object so we can use it
        NumberProcessor processor = new NumberProcessor();
        
        // Test Case 1: Ask for a number
        String userInput = JOptionPane.showInputDialog("Enter a whole number:");
        Integer result = processor.process(userInput);
        JOptionPane.showMessageDialog(null, result);
        
        // show the answer or decent error message
        if (result != -1) {
            JOptionPane.showMessageDialog(null, result);
        } else {
            JOptionPane.showMessageDialog(null, userInput + "is not an integer");
        }
        
        // Test Case 2: What happens with invalid input?
        userInput = JOptionPane.showInputDialog("Try entering something that isn't a whole number:");
        result = processor.process(userInput);
        JOptionPane.showMessageDialog(null, result);
    }
}
