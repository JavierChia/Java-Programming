
package Practical1;

import javax.swing.JOptionPane;

public class Q7 {
    public static void main(String[] agrc) {
        
        double height,width,area,perimeter;
        
        height = Integer.parseInt(JOptionPane.showInputDialog("Enter the Height"));
        width = Integer.parseInt(JOptionPane.showInputDialog("Enter the Width"));
        
        area = height*width;
        perimeter = 2*height + 2*width;
        
        JOptionPane.showMessageDialog(null,"Summary of Rectangle Measurements\nHeight : " + height + "\nWidth  : " + width + "\nArea    : " + area + "\nPerimeter : " + perimeter, null, JOptionPane.INFORMATION_MESSAGE);
    }
}
