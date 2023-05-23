import java.util.Arrays;

public class Program17Array {
    String array;

    public static void main(String[] args) {
        int[] my_array1 = {80, 25, 70, 35};
        String[] my_array2 = {"JAVA", "PYTHON", "PHP", "SQL", "c++"};
        System.out.println("Original numberic array:" + Arrays.toString((my_array1)));
        Arrays.sort(my_array1);
        System.out.println("Sorted numberic array:" + Arrays.toString((my_array1)));
        Arrays.sort(my_array2);
        System.out.println("Original String array:" + Arrays.toString((my_array2)));
        Arrays.sort(my_array2);
        System.out.println();
        System.out.println("Sorted numberic array:" + Arrays.toString((my_array2)));

    }
}