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
        mp.put("Chandan",88); // put use for insert and update both;
        System.out.println(mp.get("Chandan"));
        System.out.println(mp.remove("Rahul"));
        // Cheaking if a key  is in the hash map or not
        System.out.println(mp.containsKey("Sayan")); // give true
        System.out.println(mp.containsKey("Sayani")); // give false
        // Adding a new entry only if the new key doesnt exist already
        if(!mp.containsKey("ramu")){
            mp.put("ramu",99);
        }
    }

}
