import java.util.Scanner;

public class Program9SwitchStatment {
    /*Input any alphabet from “A" to “F” and print their city name accordingly if
any other alphabet should be invalid entry using Switch statement */
    int city;
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter an alphabet from A to F: ");
        String alphabet = scanner.next();
        switch (alphabet) {
            case "A":
                System.out.println("City: America");
                break;
            case "B":
                System.out.println("City: Brazil");
                break;
            case "C":
                System.out.println("City: Canada");
                break;
            case "D":
                System.out.println("City: Dallas");
                break;
            case "E":
                System.out.println("City: Europe");
                break;
            case "F":
                System.out.println("City: Finland");
                break;
            default:
                System.out.println("Invalid entry.");
                break;
        }
    }

}
