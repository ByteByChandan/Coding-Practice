public class Stack_implementation_using_linkedList {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }



        }
    public static class Stack{
        private node head=null;
        private int count=0;
        void push(int data){
            node element=new node(data);
            element.next=head;
            head=element;
            count++;
        }
        void display() {
            displayReverseHelper(head);
            System.out.println();
        }

        void displayReverseHelper(node temp) {
            if (temp == null) {
                return;
            }

            displayReverseHelper(temp.next);
            System.out.print(temp.data + " ");
        }
        void displayReverse(){
            node temp=head;
            for(int i =0;i<=count-1;i++){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }
        int pop(){
            if (head==null){
                System.out.print("Stack is empty!");
                return -1;
            }
            int temp =head.data;
            head=head.next;
            count--;
            return temp;
        }
        int peek (){
            if(head==null){
                System.out.print("Stack is empty!");
                return -1;
            }
            return head.data;
        }
        int size(){
            return count;
        }
        boolean isEmpty(){
            if(count==0){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args){
        Stack st=new Stack();
        st.push(5);
        st.push(8);
        st.push(20);
        st.push(11);
        st.push(9);
        st.display();
        System.out.println(st.isEmpty());
        st.pop();
        st.pop();
        System.out.println(st.peek());
        st.display();

        System.out.println(st.size());
        st.displayReverse();
    }
}
