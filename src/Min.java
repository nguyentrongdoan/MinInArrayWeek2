import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("nhap size cua mang: ");
        int m = input.nextInt();
        int[] A = new int[m];
        System.out.println("nhap gia tri vao mang:");
        for (int i = 0; i < A.length; i++){
            A[i] = input.nextInt();
        }
        System.out.print(Arrays.toString(A));

        int min = A[0];
        for (int i = 0; i < A.length; i++){
            if (A[i] < min)
                min = A[i];
        }
        System.out.println("min la:" + min);
    }
}
