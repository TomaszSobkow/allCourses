package computer.student;

public class Person {

    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " +
                "NAME: " + name +
                "\tAGE: " + age;
    }
}
