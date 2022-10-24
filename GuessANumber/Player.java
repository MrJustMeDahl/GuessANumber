public class Player {

    String name;

    public Player(String name){
        this.name = name;
    }

    public int chooseANumber(){
        System.out.println(name + " please pick a number :");
        String userInput = UI.getUserInput();
        for(int i = 0; i < 12; i++){
            System.out.println("*************");
        }
        int number = 0;
        try{
            number = Integer.parseInt(userInput);
        } catch(Exception e) {
            System.out.println("The value you have entered is not a number. Try again.");
            chooseANumber();
        }
        return number;
    }

    public String isThisCorrect(int number){
        System.out.println(name + ", " + Game.player2.name + " has guessed :" + number);
        System.out.println("Is this the correct number?");
        return UI.getUserInput();
    }
}
