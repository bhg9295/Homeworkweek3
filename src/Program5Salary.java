import java.util.Scanner;

public class Program5Salary{
    /*WAP to input employee id,name,basic salary then find HRA,TA,DA,PF and Gross salary
    HRA = basic salary 10%,DA =Basic salary 8%,TA =Basic salary 9%,PF= Basic salary 20%
    Gross salary = basic salary + HRA + TA + DA –PF*/
    int empId, salary;
    double HRA,DA,TA,PF,GS;
    String name;
    public void getdata(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Name =");
        name = ob.nextLine();
        System.out.print("empid =");
        empId = ob.nextInt();
        System.out.print("salary =");
        salary = ob.nextInt();
        HRA = salary * 0.10;
        DA = salary * 0.08;
        TA = salary * 0.09;
        PF = salary * 0.20;
        GS = salary * HRA + TA + DA - PF;
    }

    public void salaryslip(){

        System.out.println("|__________________________________________________ |");
        System.out.println("|        Salaru Slip                                |");
        System.out.println("|__________________________________________________ |");
        System.out.println("|Employee Id    :   "+empId +"                      |");
        System.out.println("|Employee Name   :  "+name +"                       |");
        System.out.println("|__________________________________________________ |");
        System.out.println("|Basic Salary     : "+salary+"                    |");
        System.out.println("|HRA 10%          :  "+HRA +"                       |");
        System.out.println("|TA 8%            :  "+TA+"                         |");
        System.out.println("|DA 9%            :   "+DA+"                        |");
        System.out.println("|PF- 20&          :   "+PF+"                        |");
        System.out.println("|___________________________________________________|");
        System.out.println("|Gross salary     :   "+GS+"                        |");
        System.out.println("|===================================================|");
    }

    public static void main(String[] args) {
        Program5Salary obj = new Program5Salary();
        obj.getdata();
        obj.salaryslip();
    }
}
