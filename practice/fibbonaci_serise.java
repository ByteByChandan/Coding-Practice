import java.util.*;
public class fibbonaci_serise {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int range= sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<range;i++){
            int temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }


    }
}
