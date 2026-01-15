import java.util.Scanner;
class SmallIdentify{
    public int Small(int arr[]){
        int s=arr[0];
        for (int i =0;i<arr.length;i++){
            if(arr[i]<s){
               s=arr[i];
            }
      //  return s;
        }           
         return s;


    }
}
public class Q1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Please enter your array number: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        SmallIdentify def = new SmallIdentify();
        int result=def.Small(arr);
        System.out.println("Your smallest number is :"+ result);
        sc.close();
    }
}
