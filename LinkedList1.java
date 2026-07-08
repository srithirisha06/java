

public class LinkedList1 {
    Node head;
    LinkedList1() {
      
    }
    public void insertAtBegining(int var1) {
      node var2 = new node(var1);
      var2.next = this.head;
      this.head = var2;
   }

   public void insertAtEnd(int var1) {
      node var2 = new node(var1);
      node var3 = this.head;
      if (this.head == null) {
         this.head = var2;
      }

      while(var3.next != null) {
         var3 = var3.next;
      }

      var3.next = var2;
   }

   public boolean search(int var1) {
      for(node var2 = this.head; var2 != null; var2 = var2.next) {
         if (var2.data == var1) {
            return true;
         }
      }

      return false;
   }

   public void deleteAtStart() {
      if (this.head != null) {
         this.head = this.head.next;
      }

   }

   public void deleteAtEnd() {
      node var1;
      for(var1 = this.head; var1.next.next != null; var1 = var1.next) {
      }

      var1.next = null;
   }
}
    

