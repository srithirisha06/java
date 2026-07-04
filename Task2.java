class Book{
    String title;
    String author;
    int year;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        
    }
    Book(String title) {
        this.title = title;
        this.author = "Unknown";
       
    }
    void display(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
    }
}



public class Task2 {
    public static void main(String[] args) {
        
        Book book1 = new Book("The Great", "thiru");
        book1.display();
        
        System.out.println();
        
//Book book2 = new Book("To Kill a Mockingbird");
       // book2.display();
    }
    
}
