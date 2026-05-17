// INHERITANCE: Student IS-A Person
public class Student extends Person {

    // Additional variable specific to Student
    private String studentId;

    // CONSTRUCTOR
    public Student(String name, int age, String city, String studentId) {
        super(name, age, city); // Call parent constructor
        this.studentId = studentId;
    }

    // Getter for studentId
    public String getStudentId() {
        return studentId;
    }

    // POLYMORPHISM: Implementing abstract method from Person
    @Override
    public void introduce() {
        System.out.println("Hi! I'm " + getName() + ", a student with ID: " + studentId);
    }

    // POLYMORPHISM: Implementing interface method from Workable
    @Override
    public void doWork() {
        System.out.println(getName() + " is studying and doing homework.");
    }

    // POLYMORPHISM: Overriding parent's displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println();
    }

    // METHOD OVERLOADING
    public void study() {
        System.out.println(getName() + " is studying.");
    }

    public void study(String subject) {
        System.out.println(getName() + " is studying " + subject);
    }
}
