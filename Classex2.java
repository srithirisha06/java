class Student {
    //properties
    String name;
    int rollno;
    //behavior
    void sleep(){
        System.out.println("sleeping");
    }
    
}
public class Classex2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "thiru";
        s1.rollno = 0;
        s1.sleep();
        Student s2 = new Student();
        s2.name = "muness";
        s2.rollno = 10;
        s2.sleep();
        System.out.println("Student 1: Name = " + s1.name + ", Roll No = " + s1.rollno);
        System.out.println("Student 2: Name = " + s2.name + ", Roll No = " + s2.rollno);
    }
    
}
