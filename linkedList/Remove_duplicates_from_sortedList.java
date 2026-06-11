public class Remove_duplicates_from_sortedList {
    public static class node {
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkelist{
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
        void RemoveDuplicates(node head){
            node temp=head;
            while(temp!=null&& temp.next!=null){
                if(temp.next.data== temp.data){
                    temp.next=temp.next.next;
                }
                else{
                    temp = temp.next;
                }
            }
            if(temp.next==null) return;
//            if(temp.next.data!=temp.data){
//                temp=temp.next;
//            }
            node heading=head;
            while(heading!=null){
                System.out.print(heading.data+" ");
                heading=heading.next;
            }
        }
    }
    public static void main(String[] args){
        linkelist ll= new linkelist();
        ll.add(1);
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(4);
        ll.add(5);
        ll.add(5);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(7);
        ll.add(8);
        ll.add(8);
        ll.add(8);
        ll.add(9);
        ll.add(10);
        ll.add(10);
        ll.add(11);
        ll.add(12);
        ll.add(12);
        ll.add(13);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        ll.add(15);
        ll.add(16);
        ll.add(16);
        ll.add(17);
        ll.add(18);
        ll.add(18);
        ll.add(19);
        ll.add(20);
        ll.add(20);
        ll.display();
        ll.RemoveDuplicates(ll.head);
        ll.display();
    }
}
