public class Program19Avgvalue {
    //Write a Java program to calculate the average value of array elements.

    public  static void m1(){
        int[]numbers = new int[]{20,30,35,35,-16,60,-100};
        // calculate sum of all array elements
        int sum =0;
        for (int i=0; i <numbers.length; i++);
       // sum = sum + numbers[i];
        // calculate avg value
        double average = sum/numbers.length;
        System.out.println("average value of the array elements i :");
    }
    public static void main(String[] args) {
        Program19Avgvalue.m1();
    }
}
