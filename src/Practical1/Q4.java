package Practical1;

import javax.swing.JOptionPane;

public class Q4 {

    public static void main(String[] args) {
        int value;
        value = Integer.parseInt(JOptionPane.showInputDialog("Enter a numeric value:"));
        while (value < 1 || value > 10) {
            JOptionPane.showMessageDialog(null, "Out of range! Please enter a number between 1 and 10!", "ERROR", JOptionPane.ERROR_MESSAGE);
            value = Integer.parseInt(JOptionPane.showInputDialog("Enter a numeric value:"));
        }
        switch (value) {
            case 1:
                JOptionPane.showMessageDialog(null,"Roman Numeric Value = I");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Roman Numeric Value = II");
                break;
            case 3:
               JOptionPane.showMessageDialog(null,"Roman Numeric Value = III");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Roman Numeric Value = IV");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Roman Numeric Value = V");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Roman Numeric Value = VI");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Roman Numeric Value = VII");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"Roman Numeric Value = VIII");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Roman Numeric Value = IX");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"Roman Numeric Value = X");
                break;

        }
    }
}
