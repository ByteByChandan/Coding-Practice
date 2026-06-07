import java.sql.SQLOutput;

public class linkedlist_practice {
    public static class node {
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        node head=null;
        node tail=null;
        void insertAtEnd(int val){
            node temp=new node(val);
            if(head==null){
               head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            node temp = head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int count(){
            node temp=head;
            int size=0;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            return size;
        }
        void insertAtHead(int val){
            node temp = new node(val);
            if(head==null){
                head =temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }

        }
        void insertAt(int val,int idx){
            node t=new node(val);
            node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            if(idx==count()){
                insertAtEnd(val);
            } else if (idx==0) {
                insertAtHead(val);
            } else if (idx<0|| idx>count()) {
                System.out.print("Invaild index");
            }

        }
        int getAt(int idx){
            node temp=head;
            for(int i =1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void insertAtend(node head,int val){
            node temp=new node(val);
            node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=temp;
            temp.next=null;
        }

    }


    public static void main(String[] args){
            LinkedList ll =new LinkedList();
            ll.insertAtEnd(4);
            ll.insertAtEnd(7);
            ll.insertAtEnd(90);
            ll.insertAtEnd(45);
            ll.insertAtEnd(5);
            ll.display();
//            int length=ll.count();
//            System.out.println(length);
            ll.insertAtHead(1);
            ll.insertAt(107,3);
            ll.display();
            int length=ll.count();
          System.out.println(length);
          int getAT=ll.getAt(4);
          System.out.print(getAT);
    }
}
