class cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }

}
public class Poly {
    public static void main(String[] args) {
        Animal[] arr={new Animal(),new cat(), new Dog()};
        for(Animal a : arr){
            a.sound();
        }
    }

    
}
