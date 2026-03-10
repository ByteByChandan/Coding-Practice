import java.util.*;
class smallest_element{
    public void smallest(int [] arr){
        int Smallest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                Smallest=arr[i];
            }
        }
        System.out.print(Smallest);
    }
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        String s=sc.nextLine();
        String []str=s.split(",");
        int []arr = new int[str.length];
        for(int i =0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        smallest_element obj=new smallest_element();
        obj.smallest(arr);
    }
}