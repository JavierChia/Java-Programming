package Practical3;

public class TestHighLowGame {
    public static void main(String[] args) {
        HighLowGame game = new HighLowGame();
        game.generateRandomNumber();
        do{
            game.getUserInput();
            game.getResult();
        } while (game.gameEnded());
    }
}
