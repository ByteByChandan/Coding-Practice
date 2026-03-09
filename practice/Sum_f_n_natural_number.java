import java.util.*;
//class  summarized {
//public int sum(int num){
//int sum=0;
//for (int i =0;i<num;i++){
//   sum+=i;
//}
//System.out.println("Your sum of N natural number in given range is : "+sum);
// return sum;
// }
//}
class Sum_f_n_natural_number{
    public int sum(int num){
        int sum=0;
        for (int i =0;i<=num;i++){
            sum+=i;
        }
        //System.out.println("Your sum of N natural number in given range is : "+sum);
        return sum;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int num=Integer.parseInt(n);
        //summarized obj =new summarized ();
        Sum_f_n_natural_number obj =new Sum_f_n_natural_number();
        int result=obj.sum(num);
        System.out.println("Your sum of N natural number in given range is : "+result);
    }
}