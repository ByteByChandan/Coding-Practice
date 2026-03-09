import java.util.*;
class Reverser{
    public int Rev(int num){
        int temp=0;
        int n=0;
        while (num!=0){
            n=num%10;
            temp=(temp*10)+n;
            num=num/10;
        }
        return temp;
    }
}
class reverse_number{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String n=sc.nextLine();
        int num=Integer.parseInt(n);
        Reverser obj=new Reverser();
        int result=obj.Rev(num);
        System.out.print(result);
    }
}