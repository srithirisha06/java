public class LinkedListhri {
   public LinkedListhri() {
   }

   public static void main(String[] var0) {
      LinkedList var1 = new LinkedList();
      var1.insertAtBeginning(30);
      var1.insertAtBeginning(20);
      var1.insertAtBeginning(10);
      var1.insertAtEnd(40);
      System.out.println(var1.search(30));
      System.out.println(var1.search(40));

      for(Node var2 = var1.head; var2 != null; var2 = var2.next) {
         System.out.print(var2.data + "->");
      }

      System.out.println("null");
   }
}
    

