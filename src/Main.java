package src;

public class Main {
    public static void main(String[] args) {
        // Primitive Types
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;
        
        // Reference Types - built out of organizing primitive types
        // 1. Strings
        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";

        // String access exercises
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);

        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        //String concatenation
        System.out.println(studentFirstName + " " + studentLastName +
        " has a GPA of " + studentGPA + ".");
    }
}
   
