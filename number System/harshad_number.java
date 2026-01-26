import java.util.Scanner;
class checkingg{
    public void harshad(int number){
        int num=number;
        int temp=0;
        //int sum=0;
        while(num!=0){
             temp=temp+(num%10);
             num=num/10;
        }
        if(number % temp==0){
            System.out.print("this number is harshad number");
        }
        else{
            System.out.print("this number is not a harshad number");
        }
    }
}

class harshad_number {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number=sc.nextInt();
        checkingg obj=new checkingg();
        obj.harshad(number);
    }
}
