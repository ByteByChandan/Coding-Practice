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
        int size=0;
        void insertAtEnd(int val){
            node temp=new node(val);
            if(head==null){
                head=temp;
                tail=temp;
                size++;
            }
            else{
                tail.next=temp;
                tail=temp;
                size++;
            }
        }
        void insertAtHead(int val){
            node t = new node(val);
            if(head==null){
                head=t;
                tail=t;
                size++;
            }
            else{
                t.next=head;
                head=t;
                size++;
            }

        }
        void  insertAt(int idx,int val){
            node t=new node(val);
            node temp=head;
            if(idx==0){
                insertAtHead(val);
                size++;
            }
            else if(idx==size()){
                insertAtEnd(val);
                size++;
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
                size++;
            }

        }
        void InserAtEnd(int val){
            node t= new node(val);
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=t;
            size++;
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
        int getAt(int idx){
            node temp=head;
            for(int i =1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            node temp=head;
            if(idx==1){
                head=head.next;
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
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
        System.out.println();
        ll.insertAtHead(54);
        ll.display();
        System.out.println();
        int data=ll.getAt(4);
        System.out.print(data);
        System.out.println();
        ll.deleteAt(1);
        ll.display();
        System.out.println();
        ll.deleteAt(1);
        ll.display();
        System.out.println();
        ll.deleteAt(1);
        ll.display();
    }
}