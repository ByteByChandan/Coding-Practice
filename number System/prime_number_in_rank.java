import java.util.*;
class prime_number_in_rank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Stating =sc.nextInt();
        int ending=sc.nextInt();
        for(int j=Stating;j<=ending;j++){
            if(j<=1){
                continue;
            }
            boolean flag=true;
            for(int i=2;i<=j/2;i++){
                if(j%2==0){
                    flag=false;
                }
            }
            if(flag== true){
                System.out.print(j+" ");
            }
        }
    }

}
