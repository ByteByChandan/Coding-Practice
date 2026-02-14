import java.util.Scanner;
class replaceing{
    public int ZerosToOne(int n){
        int tem=0;
        int number=n;
        int place =1;
        int main;
        while(number!=0){
            main=number%10;
            if(main==0){
                main=1;
            }
            tem=tem+ main *place;
            place=place*10;
            number=number/10;

        }
        return tem;
    }
}
class Replace_all_0s_with_1s_in_a_given_integer {
    public static void main(String []args){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter your number containing zeros: ");
      int num=sc.nextInt();
      replaceing obj=new replaceing();
      int result=obj.ZerosToOne(num);
      System.out.println("Replace all 0s with 1s in a given integer: "+result);

    }
}
