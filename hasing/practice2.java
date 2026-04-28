import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class practice2 {
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> mp=new HashMap<>();
        mp.put(1,"Chandan");
        mp.put(2,"Sayan");
        mp.put(3,"Rohit");
        mp.put(4,"Indrani");
        mp.put(5,"kasturi");
        mp.put(6,"sulagna");
        String name=mp.get(1);
        System.out.print(name);
        System.out.println();
        System.out.print(mp.containsKey(2)); // returns boolean-->check the key holds any value or not
        System.out.print(mp.containsValue("Rohit")); // returns boolean -->check the name holds any key or not


        Set<Integer> keys=mp.keySet();
        for(int i:keys){
            System.out.println(mp.get(i));

        }

        for(int i:mp.keySet()){
            System.out.println(mp.get(i));

        }
        Set<Map.Entry<Integer,String>> entries=mp.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
        mp.remove(3);// remove 3 value pair


    }
}
