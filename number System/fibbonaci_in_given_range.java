import java.util.Scanner;
class fibbo{
    public void fibbo_limit(int n){
        int temp=0;
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){

            if(temp<=n){
                System.out.print(" "+temp);
                temp=a+b;
                b=a;
                a=temp;
            }

        }
    }
}
public class fibbonaci_in_given_range {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your limit: ");
        int limit=sc.nextInt();
        fibbo obj= new fibbo();
        obj.fibbo_limit(limit);
    }
}
