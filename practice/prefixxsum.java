import java.util.Scanner;

public class prefixxsum {
    static void psum(int []arr){
        int []jrr=new int[arr.length];
        jrr[0]=arr[0];
        int j=1;
        for(int i =1;i<arr.length;i++){
            jrr[j++]=jrr[i-1]+arr[i];
        }
        for(int y=0;y<jrr.length;y++){
            System.out.print(jrr[y]+" ");
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        String [] str=s.split(",");
        int [] arr=new int[str.length];
        for(int i =0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        psum(arr);
    }
}
