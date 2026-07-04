class Student{
    String name;
    int rollNo;
}

public class Classex {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "thiru";
        s1.rollNo = 0;

        Student s2 = new Student();
        s2.name = "muness";
        s2.rollNo = 10;

        System.out.println("Student 1: Name = " + s1.name + ", Roll No = " + s1.rollNo);
        System.out.println("Student 2: Name = " + s2.name + ", Roll No = " + s2.rollNo);
        
    }
    
}
