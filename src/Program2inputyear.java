import java.util.Scanner;
//Write a java program to input any year like (ex.2007) and find out if it is leap year or
//not?
public class Program2inputyear {

    int year;
    public static void main(String[] args) {

        Program2inputyear obj = new Program2inputyear();
        obj.Program2();
    }
    public void Program2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the year:");
        int year = in.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) ;
        {
            System.out.println(year + " is a leap year");
        }

        {
            System.out.println(year + " is not a leap year");
        }


    }









}



