import java.util.*;
class array_element_sum {
    public int average(int []arr){
        int sum=0;
        int length=arr.length;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        int average=sum/length;
        return average;

    }
    public void chekinng(int avg,int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(avg>sum){
            System.out.print("sum is larger than avg");
        }
        else{
            System.out.print("avg is larger than sum");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []str=s.split(",");
        int [] arr = new int[str.length];
        for(int i =0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        array_element_sum  obj =new array_element_sum ();
        int result= obj.average(arr);
        obj.chekinng(result,arr);
    }
}
