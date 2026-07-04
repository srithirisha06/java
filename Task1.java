class car{
    String make;
    String model;
    int year;
    car(String make,String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println("Make:"+make);
        System.out.println("model:"+model);
        System.out.println("year:"+year);
    }

}


public class Task1 {
    public static void main(String[] args) {
        car car=new car("Toyota","Corolla",2021);
        car.display();
    }

    
}
