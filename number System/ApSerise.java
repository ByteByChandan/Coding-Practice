import java.util.*;
class printing{
    public void Ap(int fst,int r,int diff){
//        for(int i=fst;i<=r;i+=diff){
//            System.out.print(i+" ");
//        }
        int i=0;
        while(i!=r){
            System.out.print(fst+" ");
            fst+=diff;
            i++;
        }
    }
}
public class ApSerise {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first term : ");
        int fst=sc.nextInt();

        System.out.print("enter your range: ");
        int r=sc.nextInt();

        System.out.print("enter your common difference: ");
        int diff=sc.nextInt();

        printing obj=new printing();
        obj.Ap(fst,r,diff);


    }
}
