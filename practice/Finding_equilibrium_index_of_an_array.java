import java.util.*;
class Finding_equilibrium_index_of_an_array {
    static void prefixsum(int [] arr){
        for(int i =1;i<arr.length;i++){
            arr[i]= arr[i]+arr[i-1];

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void suffixsum(int []arr){
        for(int i=arr.length-2; i>=0;i--){
            arr[i]=arr[i]+arr[i+1];
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static boolean checking(int []arr,int []jrr){
        //boolean result = false;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==jrr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String []str=s.split(";");
        int [] arr =new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        int []jrr=new int[str.length];
        for(int i=0;i<jrr.length;i++){
            jrr[i]=arr[i];
        }
        prefixsum(arr);
        suffixsum(jrr);
        System.out.println (checking(arr,jrr));
    }
}