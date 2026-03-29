import java.util.Scanner;

public class three_sumsy {
    static void threesum(int t,int []arr){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int z=j+1;z<arr.length;z++){
                    if(arr[i]+arr[j]+arr[z]==t){
                        System.out.print(arr[i]+" "+arr[j]+" "+arr[z]);
                        //break;
                    }
                }
            }
        }
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int terget=sc.nextInt();
        int []arr=new int[7];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        threesum(terget,arr);
    }
}
