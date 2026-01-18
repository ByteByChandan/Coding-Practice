import java.util.Scanner;
class Prefixsum{
    public int [] prefix(int []arr){
        for(int i =1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

        }
public class array_PrefixSum {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Prefixsum obj=new Prefixsum();
        int [] brr=obj.prefix(arr);
        for(int j =0;j<arr.length;j++){
            System.out.print(brr[j]+" ");

        }
    }
}
