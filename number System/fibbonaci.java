import java.util.*;
class fiboo{
    public void fibbo_range(int n){
       long a=0;
       long b=1;
       long fibbo =0;
      //System.out.print(" "+fibbo);
        for (int i=0;i<n;i++){
            System.out.print(" "+fibbo);
            fibbo=a+b;
            b=a;
            a=fibbo;

        }

    }
}
 class fibbonaci {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your range:");
        int R= sc.nextInt();
        fiboo obj= new fiboo();
        obj.fibbo_range(R);
        sc.close();

    }
}
