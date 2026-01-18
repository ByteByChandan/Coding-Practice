import java.util.Scanner;
class shorting{
    public int [] arrayShorting(int[]arr){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
        }
        return arr;
    }
}
public class array_short {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Array Size: ");
        int num=sc.nextInt();
        int []arr=new int[num];
        System.out.println("Enter your array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        shorting obj=new shorting();
        int [] jrr=obj.arrayShorting(arr);
        System.out.print("Your Shorted array is in descending order: ");
        for(int j=0;j<arr.length;j++){
            System.out.print(jrr[j]);
        }
    }
}
