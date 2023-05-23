import java.util.Scanner;

public class Program12NumberAlphabet {
    //Write a program that tells us input value is number or an alphabet or symbol.
    static char value;
    public static void valuetypes() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter value = ");
        value = ob.next().charAt(0);
        if (value>='0' && value<='9')
        {
            System.out.println("Value is Number ");
        } else if 
        (value>='A' && value<='Z' ||value>='a'&& value<='z')
        {
            System.out.println("value is alphabet");    
        } else if (value == '+') {
            System.out.println("value is Symbol");
        } else if (value == '-'||value=='*'||value=='/'||value =='%'||value=='='||value =='@'){

            System.out.println("value is Symbol");
        } else {
            System.out.println("value is not valid");
        }
    }

    public static void main(String[] args){
        valuetypes();

    }
}
