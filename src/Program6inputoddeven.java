import java.util.Scanner;
//Write a java program to input any number and find out if it’s odd or even
public class Program6inputoddeven {
    // instance method
     public void m1(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = reader.nextInt();
        if(num%2 == 0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }



         }


      public static void main(String[] args) {
        Program6inputoddeven obj = new Program6inputoddeven();
        obj.m1();

    }

}
