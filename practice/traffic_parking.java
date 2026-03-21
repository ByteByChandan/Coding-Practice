import java.util.*;
class traffic_parking{
    static void charges(int hrs){
        int Charge=1;
        int r=1;
        if(hrs>2 && hrs<=5){
            r=hrs-2;
        }
        if(hrs>5){
            r=hrs-5;
        }
        if(hrs<=2 ){
            Charge=hrs*100;
        }
        if(hrs>2 && hrs<=5){
            Charge=200+(r*50);
        }
        if(hrs>5){
            Charge=350+(r*20);
        }
        System.out.println(Charge);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String h=sc.nextLine();
        int hrs=Integer.parseInt(h);
        charges(hrs);
    }
}