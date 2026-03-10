import java.util.*;
public class Greatest_of_three_number {
    public void chii(float[]arr){
        if(arr[0] >= arr[1] && arr[0] >= arr[2]){
            System.out.println("First element is greatest: " + arr[0]);
        }
        else if(arr[1] >= arr[0] && arr[1] >= arr[2]){
            System.out.println("Second element is greatest: " + arr[1]);
        }
        else{
            System.out.println("Third element is greatest: " + arr[2]);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []str= s.split(",");
        float []arr =new float[str.length];
        for(int i =0;i<str.length;i++){
            arr[i]=Float.parseFloat(str[i]);
        }
        Greatest_of_three_number obj =new  Greatest_of_three_number();
        obj.chii(arr);
    }
}
