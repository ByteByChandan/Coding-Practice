import java.util.Scanner;
class Cheeking{
    public void perfect(int n){
        int sum=0;
        int half;
        for(int i =1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.print("your number is perfect number");
        }
        else{
            System.out.print("your number is not a perfect number");
        }
    }
}
public class perfect_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number: ");
        int digit=sc.nextInt();
        Cheeking obj=new Cheeking();
        obj.perfect(digit);

    }
}
