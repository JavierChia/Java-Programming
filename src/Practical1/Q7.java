package Practical1;

import javax.swing.JOptionPane;

public class Q7 {
    public static void main(String[] agrc) {
        
        double height,width,area,perimeter;
        
        height = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Height", "Input",JOptionPane.INFORMATION_MESSAGE));
        width = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Width","Input",JOptionPane.INFORMATION_MESSAGE));
        
        area = height*width;
        perimeter = 2*height + 2*width;
        
        JOptionPane.showMessageDialog(null,"Summary of Rectangle Measurements\nHeight : " + height + "\nWidth  : " + width + "\nArea    : " + area + "\nPerimeter : " + perimeter, "Message", JOptionPane.QUESTION_MESSAGE);
    }
}