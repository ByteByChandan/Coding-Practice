public class Array_feq {
    public static void main(String []args){
        int[] arr ={1,1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};
        int s=arr.length;

        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<s;i++){
            int a=arr[i];
            int count=0;
            for(int j=i;j<a;j++){
                //if(a!=count) return false;
                count++;

            }
            if(a==count ) {
                System.out.print(count+ "true");
                break;
            }
            else{
                count =0;
                System.out.print(count+ "False");
                break;
            }
        }

    }
}
