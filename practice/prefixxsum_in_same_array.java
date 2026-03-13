import java.util.Scanner;
public class prefixxsum_in_same_array {
    static void singleArr(int []arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String []str=s.split(",");
        int []arr=new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        singleArr(arr);
    }
}
