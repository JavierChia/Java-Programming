package Practical3;

import javax.swing.JOptionPane;

public class SphereTest {

    public static void main(String[] args) {
        double r = 0.0;
        String rStr;
        boolean x = false;
        rStr = JOptionPane.showInputDialog(null, "Enter the radius of the sphere:", "Sphere", JOptionPane.QUESTION_MESSAGE);
        while (!x) {
            if (rStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No value entered.\nPlease enter again...", "Error", JOptionPane.ERROR_MESSAGE);
                rStr = JOptionPane.showInputDialog(null, "Enter the radius of the sphere:", "Sphere", JOptionPane.QUESTION_MESSAGE);
            } else if (rStr.matches("^[a-zA-Z]*$")) {
                JOptionPane.showMessageDialog(null, "You entered a String!\nPlease enter an integer...", "Error", JOptionPane.ERROR_MESSAGE);
                rStr = JOptionPane.showInputDialog(null, "Enter the radius of the sphere:", "Sphere", JOptionPane.QUESTION_MESSAGE);
            } else {
                r = Double.parseDouble(rStr);
                if (r <= 0) {
                    JOptionPane.showMessageDialog(null, "The value must be > 0!\nPlease enter a positive integer!", "Error", JOptionPane.ERROR_MESSAGE);
                    rStr = JOptionPane.showInputDialog(null, "Enter the radius of the sphere:", "Sphere", JOptionPane.QUESTION_MESSAGE);

                } else {
                    Sphere s = new Sphere(r);
                    JOptionPane.showMessageDialog(null, "The area of the sphere is: " + s.calculateArea() + "\nThe volume of the sphere is: " + s.calculateVolume(), "Sphere", JOptionPane.INFORMATION_MESSAGE);
                    x = true;
                }

            }
        }
    }

}
