package computer.student;

public class Student extends Person{
    String department;

    public Student(String department, String name, Integer age ) {
        super(name, age);
        this.department = department;

    }

    @Override
    public String toString() {
        return super.toString() +
                "\tdepartment: ".toUpperCase() + department;
    }
}
