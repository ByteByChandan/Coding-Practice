import java.util.HashMap;
import java.util.Scanner;

public class practice {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        HashMap<String,Integer> mp=new HashMap<>();
        mp.put("Chandan",98);
        mp.put("Sayan",87);
        mp.put("Rahul",88);
//        System.out.print("enter your range: ");
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.println("enter your name: ");
//            String name=sc.nextLine();
//            System.out.println("enter your roll number: ");
//            int roll=sc.nextInt();
//            sc.nextLine();
//            mp.put(name,roll);
//
//        }
        System.out.println(mp.get("Chandan"));
        System.out.println(mp.get("ram"));// return null
    }

}
