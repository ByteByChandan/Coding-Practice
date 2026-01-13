import java.util.Scanner;
class Sum{
    public int Sum_array(int arr[]){
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
public class Array_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Please Enter your Array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Sum obj = new Sum();
        int SumOfArray=obj.Sum_array(arr);
        System.out.println("Your Sum of Array is : "+SumOfArray);
    }
    
}
