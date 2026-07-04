class Animal{
    String name;
    void eating(){
        System.out.println("eating");
    }
    
}
class cat extends Animal{
    void meow(){
        System.out.println("meow");
    }
}
public class Inheritence {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eating();
        c.meow();
    }
    
}
