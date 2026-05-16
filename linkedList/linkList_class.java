public class linkList_class{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }

    }
    public static class linkedlist{
        node head=null;
        node tail=null;
        void insertAtEnd(int val){
            node temp=new node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        void  insertAt(int idx,int val){
            node t=new node(val);
            node temp=head;
            if(idx==0){
                insertAtHead(val);
            }
            else if(idx==size()){
                insertAtEnd(val);
            }
            else if (idx<0 || idx>size()){
                System.out.print("Incorrect index");
            }
            else {
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
            }

        }

    void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String []args){
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(76);
        ll.insertAtEnd(76);
        ll.display();
        System.out.println();
        int size=ll.size();
        System.out.println(size);
        ll.insertAt(2,100);
        ll.display();
    }
}