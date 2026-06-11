public class delete_middle_element {
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
        void add(int data){
            node temp=new node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }
        void deleteMid(){
            if(head.next==null) return;
            node fast= head.next;
            node slow= head;
            while(fast.next.next!=null&& fast.next.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            slow.next=slow.next.next;
            display();
        }
    }
    public static void main(String[] args){
        linkedlist ll= new linkedlist();
        ll.add(6);
        ll.add(7);
        ll.add(12);
        ll.add(1);
        ll.add(8);
        ll.add(10);
        ll.display();
        ll.deleteMid();
    }
}
