import java.util.Scanner;
class Overloading{
 public int sum(int a,int b){
    int sum=a+b;
    return sum;
 }
 public int sum(int a ,int b,int c){
    int sum =a+b+c;
    return sum;
 }
}
//java doesnot support operator overloading

public class Method_Overloading {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st digit: ");
            int a=sc.nextInt();
        System.out.println("Enter your 2nd digit: ");
            int b=sc.nextInt();
        System.out.println("Enter your 3rd digit: ");
            int c=sc.nextInt();
        Overloading obj=new Overloading();
        int Two_sum=obj.sum(a, b);
        System.out.println("Your 2 digit sum is: "+ Two_sum);
        int Three_sum=obj.sum(a, b, c);
        System.out.println("Your 3 digit sum is: "+ Three_sum);
        sc.close();
    }
}
