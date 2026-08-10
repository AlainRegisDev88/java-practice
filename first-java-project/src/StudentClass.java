
class Student {
    private String name;
    private double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    Student() {
        this.name = "PENDING_REGISTRATION";
        this.gpa = 0.0;
    }

    Student( Student object){
        this.name = object.name;
        this.gpa = object.gpa;
    }

    public void raiseGpa(double raiseValue) {
        if (0 <= raiseValue + gpa && 4 >= raiseValue + gpa) {
            gpa += raiseValue;
        }
        
    }

    public void print() {
        System.out.printf(name + ": " + gpa);
    }

    // constructor that defaults GPA to 0.0

}

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student("Regis", 3.5);
        Student s2 = s1;
        s1.print();
        s1.raiseGpa(.1);
        System.out.println();
        s1.print();
        System.out.println();
        s2.print();

        //add the no-args default constructor
        Student s3 = new Student();
        System.out.println();
        s3.print();

        //copy conatructor

        Student s4 = new Student(s1);
        System.out.println("\nOriginal Copy");
        s4.print();
        s4.raiseGpa(3);
        System.out.println("\nOriginal");
        s1.print();
        System.out.println("\nOriginal Copy Altered");
        s4.print();

    }
}
