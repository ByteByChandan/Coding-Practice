import java.util.*;
class Stringss{
    public String [] Reverse(String []arr){
        String []jrr=new String[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            jrr[j++]= String.valueOf(arr[i]);
        }
        return jrr;
    }
}
public class String_reverse_using_array {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        String []arr=new String[7];
        System.out.print("Enter your String (Must be in 20 characters: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        Stringss obj = new Stringss();
        String [] Result=obj.Reverse((arr));
        System.out.print("your reverse string is : ");
        for(int j=0;j<arr.length;j++){
            System.out.print(Result[j]);
        }
    }
}
