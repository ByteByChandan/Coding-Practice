import java.util.Scanner;

class array_sum {
    public int[] summ(int[] arr) {
        int[] jrr = new int[arr.length / 2];
        int j = 0;

        for (int i = 0; i < arr.length; i += 2) {
            jrr[j++] = arr[i] + arr[i + 1];
        }
        return jrr;
    }
}

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your array size in even number: ");
        int size= sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Your "+size+" digit Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        array_sum obj = new array_sum();
        int[] arraysum = obj.summ(arr);

        System.out.println("The small sum of array is:");
        for (int i = 0; i < arraysum.length; i++) {
            System.out.print(" "+arraysum[i]);
        }
        sc.close();
    }
}

