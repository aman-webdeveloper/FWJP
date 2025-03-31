public class Student {
    private int rollno;
    private String name;
    private int age;
    private float salary;

    // Constructor with parameters
    public Student(int rollno, String name, int age, float salary) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("Initializing all variables...");
    }

    // Default Constructor
    public Student() {
        System.out.println("Calling default constructor...");
    }

    // Getter and Setter for Roll Number
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for Salary
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
