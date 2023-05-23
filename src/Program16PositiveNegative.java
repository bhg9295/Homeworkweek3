import java.util.Scanner;

public class Program16PositiveNegative {
    /*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
    “ZERO”*/
    public static void main(String[] args) {
        Program16PositiveNegative obj = new Program16PositiveNegative();
        obj.string();
    }
    public void string (){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        number = sc.nextInt();
        sc.close();
        if (number > 0){
            System.out.println(number + " is positive number");
        } else if (number < 0 )
        {
            System.out.println(number + "is negative number");
        }
        else
        {
            System.out.println(number + "is neighther positive or negative");
        }

    }
}
