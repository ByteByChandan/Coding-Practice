import java.util.*;
class fibbo{
    public void fibbo_range(int n){
       long a=0;
       long b=1;
       long fibbo =0;
      //System.out.print(" "+fibbo);
        for (int i=0;i<n;i++){
            fibbo=a+b;
            b=a;
            a=fibbo;
            System.out.print(" "+fibbo);
        }

    }
}
 class fibbonaci {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your range:");
        int R= sc.nextInt();
        fibbo obj= new fibbo();
        obj.fibbo_range(R);
        sc.close();

    }
}
