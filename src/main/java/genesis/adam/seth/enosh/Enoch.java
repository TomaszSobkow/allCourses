package genesis.adam.seth.enosh;

import genesis.adam.seth.Seth;

public class Enoch extends Seth {

    public Enoch(String name, boolean isDescription) {
        super(name, isDescription);
        setDescription("");
        if(isDescription){
            setDescription("At that time people began calling on the name of Jehovah.");
        }
    }

    @Override
    public String toString() {
        return "\n\t\t"+getClass().getSimpleName()+ ": " + getDescription();
    }
}
