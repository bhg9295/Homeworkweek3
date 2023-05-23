import java.util.Scanner;

public class Program8Ifelse {
    /*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
    any other alphabet should be invalid entry*/
    int city;
    public static void main(String[] args) {
        Program8Ifelse obj = new Program8Ifelse();
        obj.setAlphabet();
    }public void setAlphabet() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an alphabet from A to F: ");
        String alphabet = input.next();
        if (alphabet.equals("A")) {
            System.out.println("City: America");
        } else if (alphabet.equals("B")) {
            System.out.println("City: Brazil");
        } else if (alphabet.equals("C")) {
            System.out.println("City: Canada");
        } else if (alphabet.equals("D")) {
            System.out.println("City: Dallas");
        } else if (alphabet.equals("E")) {
            System.out.println("City: Europe");
        } else if (alphabet.equals("F")) {
            System.out.println("City: Fort Worth");
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from A to F.");
        }
    }
}