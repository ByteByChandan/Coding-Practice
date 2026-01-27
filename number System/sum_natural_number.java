import java.util.Scanner;
class suma{
    public int sum_natural(int s){
        int sum_o=0;
        for(int i=0;i<=s;i++){
            sum_o+=i;
        }
        return sum_o;
    }
}
class sum_natural_number {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your range: ");
        int range = sc.nextInt();
        suma obj = new suma();
        int result = obj.sum_natural(range);
        System.out.print("Your sum of n natural number is : "+result);
    }
}
