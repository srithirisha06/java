class Node{
    int data;
    Treee next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Treee head;
    public void insertAtBegining(int data){
        Treee newNode=new Treee(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Treee newNode=new Treee(data);
        Treee temp=head;
        if(head==null){
            head=newNode;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public boolean search(int data){
        Treee temp=head;
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
    Treee temp = head;
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
        
        Treee temp=list.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

}
    

