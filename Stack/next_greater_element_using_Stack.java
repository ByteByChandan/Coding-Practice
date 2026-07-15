import java.util.Stack;

public class next_greater_element_using_Stack {
    public static void main(String[] args){
        int []arr={1,5,3,2,1,6,3,4};
        int s=arr.length;
        Stack<Integer>st=new Stack<>();

        int []res=new int[s];
        res[s-1]=-1;
        st.push(arr[s-1]);
        for(int i=s-2;i>=0;i--){
            res[i]=-1;
            while(st.size()>0 &&  st.peek()<arr[i] ){
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);

        }
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i =0;i<s;i++){
            System.out.print(res[i]+" ");
        }

    }
}
