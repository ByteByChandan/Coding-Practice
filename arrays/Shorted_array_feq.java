import java.util.Scanner;
class Array_frequency{
    public void freq(int []arr){
        int feq=1;
        int i=1;
        for(i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                feq+=1;
//                System.out.println(arr[i]+" frequency is "+feq);
            }
            else{
                System.out.println(arr[i-1]+" frequency is "+feq);
                feq=1;
            }
        }
        System.out.println(arr[arr.length - 1] + " frequency is " + feq);
    }
}
public class Shorted_array_feq {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int S=sc.nextInt();
        int [] arr=new int [S];
        System.out.print("Enter your array input: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Array_frequency obj =new Array_frequency();
        obj.freq(arr);
    }
}
