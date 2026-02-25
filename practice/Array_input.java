import java.util.*;
public class Array_input {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your array seprated by coma");
        String Input=sc.nextLine();
        String[] S=Input.split(",");
        int []arr=new int[S.length];
        for(int i =0;i<arr.length;i++){
            arr[i]=Integer.parseInt(S[i].trim());
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
