import java.util.Scanner;
class array_marger{
    public void marging(int []arr,int []jrr,int m){
        int [] zrr=new int[m];
        int x=0;
        for(int i =0;i<arr.length;i++){
            zrr[x++]=arr[i];
        }
        for(int j=m-arr.length;j< zrr.length;j++){
            zrr[x++]=jrr[j];
        }
        System.out.println("After margine two arrays: ");
        for (int y=0;y< zrr.length;y++){
            System.out.println(zrr[y]);
        }

    }
}

public class array_marge {
    // mage two arrays and finding distinct elements
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your 1st array size: ");
        int s=sc.nextInt();
        int []arr=new int [s];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter your 2nd array size: ");
        int se=sc.nextInt();
        int []jrr=new int [se];
        for(int t=0;t<jrr.length;t++){
            jrr[t]=sc.nextInt();
        }
        int total_array_size=s+se;
        array_marger obj=new array_marger();
        obj.marging(arr,jrr,total_array_size);
    }
}
