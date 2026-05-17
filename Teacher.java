// INHERITANCE: Teacher IS-A Person
public class Teacher extends Person {

    // Additional variable for Teacher
    private String subject;

    // CONSTRUCTOR
    public Teacher(String name, int age, String city, String subject) {
        super(name, age, city); // Call parent constructor
        this.subject = subject;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // POLYMORPHISM: Different implementation than Student
    @Override
    public void introduce() {
        System.out.println("Hello! I'm " + getName() + ", I teach " + subject);
    }

    // POLYMORPHISM: Different implementation than Student
    @Override
    public void doWork() {
        System.out.println(getName() + " is teaching " + subject + " class.");
    }

    // POLYMORPHISM: Override displayInfo to add subject
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println();
    }

    // METHOD OVERLOADING
    public void teach() {
        System.out.println(getName() + " is teaching.");
    }

    public void teach(String topic) {
        System.out.println(getName() + " is teaching " + topic);
    }
}
