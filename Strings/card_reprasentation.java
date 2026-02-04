import java.util.*;
class card_reprasentation {
    public static void main(String []args){
        String J,Q,K,A;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your cards: ");
        String s =sc.nextLine();
        StringBuilder str = new StringBuilder(s);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }
            if(str.charAt(i)== '2' || str.charAt(i)== '3' || str.charAt(i)=='4' || str.charAt(i)=='5' ||str.charAt(i)=='6'){
                count+=1;
            }
            if (str.charAt(i)=='7' || str.charAt(i)=='8' || str.charAt(i)=='9') {
                count+=0;

            }
            if (str.charAt(i)== '1'&& str.charAt(i)=='0') {
                count-=1;

            }
            if (str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'Q') {
                count -=1;

            }
            if (str.charAt(i)=='A') {
                count-=1;
            }


        }
        System.out.println("your output is : "+count);
    }
}
