import java.util.Scanner;
class Reverse{
    public int []Array_reverse(int []arr){
        System.out.println("Your array reverse : ");
        int j=0;
        int []jrr=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
           jrr[j++]=arr[i];
        }
        return jrr;
    }
}

public class reverse_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        System.out.println("Enter Your array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Reverse obj=new Reverse();
        int[] reverse=obj.Array_reverse(arr);
        for(int i=0;i<reverse.length;i++){
            System.out.print(reverse[i]);
        }
            sc.close();
    }
}
