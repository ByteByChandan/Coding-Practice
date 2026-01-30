import java.util.Scanner;
class window{
    public int Window_sum(int []arr,int S){
        int csum=0;
        int msum=-100;
        int Size=arr.length;
        int k=S;
        for(int i =0;i<Size-k;i++){
            for(int j=i;j<k-1;j++){
                csum=csum+arr[j];
                if(csum>msum){
                    msum=csum;
                }
            }
        }
        return msum;
    }
}
class sliding_window_target_sum {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter your array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter your window size: ");
        int s = sc.nextInt();
        window obj=new window();
        int result=obj.Window_sum(arr,s);
        System.out.print("the max sum is of your window length "+s+" is : "+result);
    }
}
