import java.util.Scanner;
class compared{
    public void gretest(int n1,int n2,int n3){
        if(n1>n2 && n1>n3){
            System.out.print("The first number "+n1+" is greatest");
        }
        else if (n2>n1 && n2>n3){
            System.out.print("The second number "+n2+" is greatest");
        }
        else {
            System.out.print("The third number "+n3+" is greatest");
        }
    }
}
public class greatest_of_two {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int first_number=sc.nextInt();
        System.out.print("Enter your second  number: ");
        int second_number=sc.nextInt();
        System.out.print("Enter your third  number: ");
        int third_number=sc.nextInt();
        compared obj =new compared();
        obj.gretest(first_number,second_number,third_number);
    }
}
