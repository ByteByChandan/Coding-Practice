import java.util.*;
class Checking{
    public void pallindrom_cheaker(String S){
        String Str1=S;
        String Str2="";
        for(int i=0;i<Str1.length();i++){
            Str2=Str1.charAt(i)+Str2;
        }
        if(Str1.equals(Str2)){
            System.out.println("Your String is pallindrom");
        }
        else{
            System.out.println("Your Sring is not pallindrom");
        }

    }
}
public class Check_pallindrom   {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str=sc.nextLine();
        Checking obj=new Checking();
        obj.pallindrom_cheaker(str);
    }
}
