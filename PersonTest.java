public class PersonTest {
    public static void main(String[] args) {

        System.out.println("=== Person Management System ===\n");

        // ==========================================
        // 1. CREATING OBJECTS using CONSTRUCTORS
        // ==========================================
        Student student1 = new Student("Alice", 20, "New York", "S001");
        Student student2 = new Student("Bob", 22, "London", "S002");

        Teacher teacher1 = new Teacher("Mr. Smith", 35, "Paris", "Math");
        Teacher teacher2 = new Teacher("Ms. Johnson", 40, "Tokyo", "Science");

        // ==========================================
        // 2. ENCAPSULATION DEMO
        // ==========================================
        System.out.println("--- Encapsulation Demo ---");

        // Use getter to read private variable
        System.out.println("Student name: " + student1.getName());

        // Direct access would cause error (kept as comment to show awareness):
        // System.out.println(student1.name); // ERROR! name is private

        // Use setter to change age
        student1.setAge(21);
        System.out.println("Updated age: " + student1.getAge());

        System.out.println();

        // ==========================================
        // 3. DISPLAY INFORMATION
        // ==========================================
        System.out.println("--- Display Information ---");
        student1.displayInfo();
        student2.displayInfo();
        teacher1.displayInfo();
        teacher2.displayInfo();

        // ==========================================
        // 4. POLYMORPHISM - introduce() method
        // ==========================================
        System.out.println("--- Polymorphism: introduce() ---");
        student1.introduce();
        student2.introduce();
        teacher1.introduce();
        teacher2.introduce();

        System.out.println();

        // ==========================================
        // 5. POLYMORPHISM - doWork() method
        // ==========================================
        System.out.println("--- Polymorphism: doWork() ---");
        student1.doWork();
        student2.doWork();
        teacher1.doWork();
        teacher2.doWork();

        System.out.println();

        // ==========================================
        // 6. METHOD OVERLOADING DEMO
        // ==========================================
        System.out.println("--- Method Overloading ---");
        student1.study();
        student1.study("Mathematics");

        System.out.println();

        teacher1.teach();
        teacher1.teach("Algebra");

        System.out.println();

        // ==========================================
        // 7. USING LOOPS TO CREATE MULTIPLE OBJECTS
        // ==========================================
        System.out.println("--- Creating Multiple Students Using Loop ---");
        for (int i = 1; i <= 3; i++) {
            Student s = new Student("Student" + i, 18 + i, "City" + i, "S00" + (i + 2));
            s.displayInfo();
        }

        // ==========================================
        // 8. STATIC METHOD
        // ==========================================
        Person.showTotal();

        // ==========================================
        // 9. ABSTRACTION NOTE
        // ==========================================
        System.out.println("\n--- Abstraction Explanation ---");

        // Cannot instantiate abstract class (kept as comment):
        // Person p = new Person("Test", 25, "City"); // ERROR! Person is abstract

        System.out.println("Note: Cannot create Person object directly because it's abstract.");
        System.out.println("We can only create Student or Teacher objects.");
    }
}
