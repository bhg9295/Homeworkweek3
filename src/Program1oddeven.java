import java.util.Scanner;

public class Program1oddeven {
    //Write a java program that tells us that Input number is odd or even

        // instance method
        public void findoddeven() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number :");
            int inputnumber = sc.nextInt();
            sc.close();
            // Ternary method
            String result = inputnumber % 2 == 0 ? "Even number" : "odd number";
            System.out.println(inputnumber + "is" + result);}

        public static void main(String[] args) {
        Program1oddeven obj = new Program1oddeven();
        obj.findoddeven();
        }

    }


