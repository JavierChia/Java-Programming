package Practical3;



import javax.swing.JOptionPane;

public class HighLowGame {

    private int randomNumber, guess;

    public int generateRandomNumber() {
        randomNumber = (int) Math.floor(Math.random() * 100);
        return randomNumber;
    }

    public int getUserInput() {
        guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your guess.", "Input", JOptionPane.QUESTION_MESSAGE));
        return guess;
    }

    public void getResult() {
        if (guess > randomNumber) {
            JOptionPane.showMessageDialog(null, guess + " is higher than the Magic Number", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (guess < randomNumber) {
            JOptionPane.showMessageDialog(null, guess + " is lower than the Magic Number", "Message", JOptionPane.INFORMATION_MESSAGE);
        }  else {
            JOptionPane.showMessageDialog(null, guess + " is the Magic Number!!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public boolean gameEnded() {
        boolean x = true;
        if (guess > randomNumber || guess < randomNumber) {
            return x;
        }
        else {
            return !x;
        }
    }

}    



                
                
//    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Welcome to The High Low Number Game", "Message", JOptionPane.INFORMATION_MESSAGE);
//
//        HighLowGame game = new HighLowGame();
//        
//    };
//};
//    game.generateRandomNumber ();
//
////        do {
////            game.getUserInput
////        }
//}
//}
