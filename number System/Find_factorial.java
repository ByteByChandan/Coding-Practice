import java.util.Scanner;
class factorial{
    public int finding(int n){
        int multi=1;
        if(n==0){
            return 1;
        }
        else{
            for(int i=1;i<=n;i++){
                multi*=i;
            }
        }
        return multi;
    }
}

public class Find_factorial {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number of factorial: ");
        int num=sc.nextInt();
        factorial fc=new factorial();
        int result=fc.finding(num);
        System.out.println("your "+num+" factorial is :"+result);
    }
}
