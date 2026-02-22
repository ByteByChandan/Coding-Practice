import java.util.*;
class searching{
    public int B_search(int []arr,int n){
        Arrays.sort(arr);

        int f=0;
        int l=arr.length-1;
        while(f<=l){
            int mid=(l + f) / 2;
            if(arr[mid]==n){
                return mid;
        }
            else if(n<arr[mid]){
                l=mid-1;
                f=f;

        }
            else{
                f=mid+1;
                l=l;


            }
        }
            return -1;
    }
}

public class binary_search {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int []arr=new int[s]; //9 1 2 3 8
        for(int i =0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your Searching element: ");
        int num= sc.nextInt();
        searching obj= new searching();
        int result =obj.B_search(arr,num);
        System.out.println("the index of array element is "+result);
    }
}
