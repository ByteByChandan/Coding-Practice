import java.util.Scanner;
class Check{
    public int Checking(int number){
        int num=number;
        int temp=0;
//        int main;
        while(num!=0){
            int main=num%10;
            temp=(10*temp)+main;
            num=num/10;

        }
        return temp;
    }
}
class Pallindom{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your number: ");
        int number=sc.nextInt();
        Check obj=new Check ();
        int answer=obj.Checking(number);
       // System.out.println("your number is : "+answer);

        if(number==answer){
            System.out.print("Your number is pallindrom");
        }
        else{
            System.out.print("your number is not a pallindrom");
        }
    }
}
