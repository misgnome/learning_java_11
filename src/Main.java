package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // While loops
       boolean isCurrentSongOnRepeat = true;
       Scanner input = new Scanner(System.in);

       while(isCurrentSongOnRepeat) {
        System.out.println("Playing current song");
        System.out.println("Would you like to take this song off of repeat? (y/n)");
        String userInput = input.next();

        if (userInput.equals("y")) {
            isCurrentSongOnRepeat = false;
        }
       }
       System.out.println("Playing next song");
    }
}
   
