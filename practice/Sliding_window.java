import java.util.Scanner;

public class Sliding_window {
    static void slide(int w,int []arr){
        int max=Integer.MIN_VALUE;
        for(int i =0;i<=arr.length-w;i++){
            int sum=0;
            for(int j=i;j<i+w;j++){
                sum+=arr[j];
                if(sum>max);
                max=sum;
            }
        }
        System.out.println(max);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int window= sc.nextInt();
        int []arr=new int[6];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        slide(window,arr);
    }
}
