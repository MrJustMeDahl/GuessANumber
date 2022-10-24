import java.util.Scanner;

public class UI {

    public static Scanner scan = new Scanner(System.in);

    public static String getUserInput(){
        String result = "";
        result += scan.nextLine();
        return result;
    }

}
