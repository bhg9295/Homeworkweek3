import java.util.Scanner;

public class Program10Mathsoperation {
    /*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)*/
    public static void Calculator(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First number");
        int number1 =s.nextInt();
        System.out.println("Enter Second number");
        int number2 =s.nextInt();
        System.out.println("Enter Symbol");
        char symbol = s.next().charAt(0);
        s.close();
        if (symbol== '+') {
            int sum = number1 + number2;
            System.out.println("The addition of two number is:" + sum);
        } else if (symbol == '-') {
            int sub = number1 - number2;
            System.out.println("the substration of two number is"+sub);
        } else if (symbol == '*') {
            int mul = number1 * number2;
            System.out.println("the multiplication of two number is" + mul);
        } else if (symbol =='/') {
            int div = number1/number2;
            System.out.println("the division of two number is\" +div");
        }else {
            System.out.println("invalid entry");
        }
    }

    public static void main(String[] args) {
        Calculator();// calling instance method
    }

}
