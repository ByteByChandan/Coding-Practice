import java.util.*;
public class array_freq {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your array Size: ");
        int s=sc.nextInt();
        int []arr = new int[s];
        HashMap<Integer,Integer>feq=new HashMap<>();
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(!feq.containsKey(arr[i])){
                feq.put(arr[i],1);
            }
            else{
                feq.put(arr[i],feq.get(arr[i])+1);
            }
        }
        System.out.print("Frequency Map: ");
        System.out.print(feq.entrySet());
        int max_feq=0;
        int anskey=-1;
        for(var i:feq.entrySet()){
            if(i.getValue()>max_feq){
            max_feq=i.getValue();
            anskey= i.getKey();
            }
        }
        System.out.println();
        System.out.printf("%d has max frequency and it occurs %d times",anskey,max_feq);
    }
}
