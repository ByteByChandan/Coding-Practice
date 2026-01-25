import java.util.Scanner;
class kiryaKalap{
    public int kriyas(int m,int n){
        int series=n;
        int rotation=m;
        int sum=0;
        for(int i =series;i>=2;i-=2){
            sum+=i;
            //System.out.println(i);
        }
        //System.out.println("sum is:"+sum);
        int result=sum*rotation;
        return result;
    }
}
public class kriyas_tcs_nqt {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the size of the kriyas:");
        int n=sc.nextInt();
        System.out.print("enter the vanishing point:");
        int m=sc.nextInt();
        kiryaKalap obj=new kiryaKalap();
        int result=obj.kriyas(m,n);
        System.out.println("result is:"+result);
    }
}
