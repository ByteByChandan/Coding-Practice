import java.util.Scanner;
class EvenOdd_check{
    void checker(int n){
        if(n%2==0){
            System.out.println("Your Number is Even");
        }
        else{
            System.out.println("Your number is Odd");
        }
    }
}

public class EvenOrOdd {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num=sc.nextInt();
        EvenOdd_check obj=new EvenOdd_check();
        obj.checker(num);

    }
}
