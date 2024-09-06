package src;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

import java.text.DecimalFormat;
public class Triangle {
    static int numOfSides = 3;
    static int sumOfAngles = 180;

    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public Triangle(double base, double height, double sideLenOne, 
                    double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return((this.base * this.height) / 2);
    
}

public class Main {

    // Classes in Java
    
    }
    // Functions in JAVA
    public static void announceDeveloperTeaTime () {
        System.out.println("Waiting for Developer Tea Time...");
        System.out.println("Type in a random word and press Enter to start Developer Tea Time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's Developer Tea Time!!!!");
        input.close();

    }
    public static double calculateTotalMealCost(double tipRate, double listedMealPrice, double salesTaxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = salesTaxRate * listedMealPrice;
        double result = Math.round((listedMealPrice + tip + tax)) * 100/ 100;
        DecimalFormat f = new DecimalFormat("##.##");

        System.out.println("The total cost of your meal is $" + f.format(result) + ".");
        return result;
    }
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 7);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.findArea();
        System.out.println("triangle A area is " + triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println("triangle B area is " + triangleBArea);

        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);
        System.out.println(Triangle.numOfSides);
        System.out.println(Triangle.sumOfAngles);
    }
      
       
}

   
