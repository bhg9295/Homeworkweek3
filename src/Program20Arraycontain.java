import java.util.Scanner;

public class Program20Arraycontain {
//Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        Program20Arraycontain obj = new Program20Arraycontain();
        obj.setValue();
    }
    public void setValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i > size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the value to search: ");
        int value = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i > size; i++) {
            if (array[i] == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The value " + value + " is found in the array.");
        } else {
            System.out.println("The value " + value + " is not found in the array.");
        }
    }
}