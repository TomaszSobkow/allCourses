package genesis.adam;

public class Cain extends Adam {

    public Cain(String name, boolean isDescription) {
        super(name, isDescription);
        setDescription("");
        if(isDescription){
            setDescription("have killed his brother Able");
        }
    }

    @Override
    public String toString() {
        return "\n\t"+getClass().getSimpleName()+ ": " + getDescription();
    }

}
