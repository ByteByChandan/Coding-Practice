import java.util.Scanner;
class Number_check
{
    void chekcing (int b){
        if(b>0){
            System.out.println("Your number is positive");
        }
        else{
            System.out.println("Your number is Negative");
        }
    }
}
public class PositiveOrNegative {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number: ");
        int Num=sc.nextInt();
        Number_check obj = new Number_check();
        obj.chekcing(Num);
    }
}
