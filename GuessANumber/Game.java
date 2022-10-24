public class Game {
    static Player player1;
    static Player player2;
    int chosenNumber;
    public void gameSetup(){
        player1 = new Player("Nicolai");
        player2 = new Player("Danyal");
        chosenNumber = player1.chooseANumber();
    }

    public void runGame(){
        int guess = 0;
        int numberOfGuesses = 0;
        while(chosenNumber != guess) {
            guess = player2.chooseANumber();
            player1.isThisCorrect(guess);
            numberOfGuesses++;
            if(numberOfGuesses == 10){
                System.out.println("You've lost the game.");
                break;
            }
        }
    }

    private boolean isPlayerHuman(){
        String input = "";
        return false;
    }
}
