package genesis;

public class Person {
    private final String name;
    private String description;

    public Person(String name, boolean isDescription) {
        this.name = name;
        description = "Adam, the “son of God,” first human creature! (Lu 3:38)";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
