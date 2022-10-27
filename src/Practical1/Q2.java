package Practical1;

import javax.swing.JOptionPane;

public class Q2 {

    public static void main(String[] args) {
        boolean correctInput = false;

        do {
            double pH = Integer.parseInt(JOptionPane.showInputDialog("Enter pH level of the tested water:"));
            if (pH >= 0 && pH <= 14) {
                correctInput = true;

                if (pH < 7 && pH >= 0) {
                    JOptionPane.showMessageDialog(null, "Your aquarium water is acidic");
                } else if (pH == 7) {
                    JOptionPane.showMessageDialog(null, "Your aqaurium water is neutral");
                } else if (pH > 7 && pH <= 14) {
                    JOptionPane.showMessageDialog(null, "Your aqaurium water is akaline");
                }

            }
        } while (!correctInput);
    }
}
//JOptionPane.showMessageDialog(null, "Please enter a valid pH level of the test water:");

