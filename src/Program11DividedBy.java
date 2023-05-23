public class Program11DividedBy {
    /*Write a java program to print the numbers between 1 to 100 which can be divided by 3
    and 5 separately.*/
    public static void main(String[] args) {
        Program11DividedBy obj = new Program11DividedBy();
        obj.printspecificnumber();
    }
    public void printspecificnumber(){
        System.out.println("number between 1 to 100 which can be divided by 3:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) ;
            System.out.println(i + ",");
        }
        System.out.println("number between 1 to 100 which can be divided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }

        }
    }


