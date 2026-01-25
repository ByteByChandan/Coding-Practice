import java.util.Scanner;
class win {
    public int[] windows(int[] arr, int k) {
        int n = arr.length;
        int[] jrr = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            jrr[i] = max;
        }
        return jrr;
    }
}
public class window_size_tcs {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.print("Enter your arry elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your window size: ");
        int window=sc.nextInt();
        win obj=new win();
        int []new_arr=obj.windows(arr,window);
        System.out.println("New array is :");
        for(int z=0;z<arr.length;z++){
            System.out.print(new_arr[z]);
        }
    }
}
