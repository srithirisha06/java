abstract class Shape{
    abstract double CalculateArea();
    
    }
class Circle extends Shape{
    int radius;
    Circle(int radius){
      this.radius = radius;
    }
    double CalculateArea(){
        return 3.17* radius * radius;
    }
}
class square extends Shape{
    int side;
    square(int side){
        this.side = side;
    }
    double CalculateArea(){
        return side * side;
    }
    
}
class Rectangle extends Shape{
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    double CalculateArea(){
        return length * breadth;
    }
}
public class Abstractmeth {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area of Circle: " + c.CalculateArea());
        
        square s = new square(4);
        System.out.println("Area of Square: " + s.CalculateArea());
        
        Rectangle r = new Rectangle(6, 3);
        System.out.println("Area of Rectangle: " + r.CalculateArea());

    }
    
}
