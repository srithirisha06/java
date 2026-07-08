class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertAtBegining(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public boolean search(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data) return true;
            temp=temp.next;
        }
        return false;
    }
    public  void deleteAtStart(){
     if(head !=null){
       head=head.next;
    }
}
public void deleteAtEnd(){
    Node temp = head;
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
 




}
}
public class Linkedlistwo {

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtBegining(30);
        list.insertAtBegining(20);
        list.insertAtBegining(10);
        list.insertAtEnd(40);
        list.deleteAtEnd();
        System.out.println(list.search(30));
        System.out.println(list.search(99));
        
        Node temp=list.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

}
    

