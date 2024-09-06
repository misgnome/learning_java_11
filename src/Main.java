package src;
import java.util.Scanner;

public class Main {
    // Functions in JAVA
    public static void announceDeveloperTeaTime () {
        System.out.println("Waiting for Developer Tea Time...");
        System.out.println("Type in a random word and press Enter to start Developer Tea Time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's Developer Tea Time!!!!");

    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job.");

        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();
    }
      
       
}

   
