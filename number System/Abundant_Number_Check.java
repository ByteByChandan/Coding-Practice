import java.util.Scanner;
class chekking{
    public void Abundant(int num){
        int sum=0;
        int i =1;
        while(i<num){
            if(num%i==0){
                sum+=i;

            }
            i++;
        }
        if(sum>num){
            System.out.println("The number is Abundant number");
        }
        else{
            System.out.println("The number is not a Abundant number");
        }
    }
}

public class Abundant_Number_Check {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num=sc.nextInt();
        chekking obj=new chekking();
        obj.Abundant(num);
    }
}
