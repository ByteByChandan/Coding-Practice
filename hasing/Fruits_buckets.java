import java.util.*;
public class Fruits_buckets {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> fruitmap = new HashMap<>();
        String [] fruitsName={"Apple","Banana","Grapes","Orange"};
        for(String Fruit : fruitsName){
            System.out.println("Enter quantity For "+ Fruit+ " : ");
            int qty =sc.nextInt();
            fruitmap.put(Fruit,qty);
        }
        //print result
        System.out.print("Stored data");
        for(Map.Entry<String,Integer> entry : fruitmap.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
    }
}