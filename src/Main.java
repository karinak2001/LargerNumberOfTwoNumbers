import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    // לבקש מהמשתמש להזין את המספר הראשון
    System.out.println("Enter the first number: ");
    double num1 = scanner.nextDouble();


    // לבקש מהמשתמש להזין את המספר השני
    System.out.println("Enter the second number: ");
    double num2 = scanner.nextDouble();

    // בודקים איזה מספר גדול יותר
    if (num1 > num2) {
        System.out.println("The larger number is: " + num1);
    } else {
        System.out.println("The larger number is: " + num2);
    }

    }
}