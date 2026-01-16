import java.util.Scanner;
class check{
    public int pal_check(int num){
        //int n=num;

        //int number=0;
        int count=0;
        for(int i =1;i<=num;i++){
            int number=i;
            int temp=0;
            int original=i;
            while(number!=0){
                int digit=number%10;
                temp=(10*temp)+digit;
                number=number/10;
            }
            if(original==temp){
                System.out.print(original+" ");
                count++;
            }
        }
        return count;
    }
}

public class pallindrom_in_given_range {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your Range of number: ");
        int Range=sc.nextInt();
        check obj =new check();
        int value=obj.pal_check(Range);
        System.out.println();
        System.out.println("The numbers in given range is : "+value);
        sc.close();
    }
}
