import java.util.Scanner;

public class Program7Seller {
    /*Write a java program input sales id, seller's name, sales amount, and salary basic and
    then fined this sales*/
    int sID,amount,basicSalary,sale;
    String name;
    double c;
    public void sales(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Sales name = ");
        name = ob.nextLine();
        System.out.println("sales Id =");
        sID = ob.nextInt();
        System.out.println("sales amount = ");
        amount = ob.nextInt();
        System.out.println("Basic salary = ");
        basicSalary =ob.nextInt();
        System.out.println("sales =");
        sale = ob.nextInt();
    }
    public void commission(){
        if (amount>=50000)
        {
            c =amount*0.35;
            System.out.println("Commision = "+c);
        }
        else if (amount>=30000)
        {
            c =amount*0.20;
            System.out.println("Commision = "+c);
        }
        else if(amount>=20000)
        {
            c =amount*0.10;
            System.out.println("Commision = "+c);
        } else if (amount>=10000)
        {
            c = amount*0.05;
            System.out.println("Commision = "+c);
        } else if (amount<10000)
        {
            c =amount*0.02;
            System.out.println("Commision = "+c);
        }else
        {
            System.out.println("No commision");
        }
    }
    public static void main(String[]args){
        Program7Seller obj = new Program7Seller();
        obj.sales();
        obj.commission();
    }
}
