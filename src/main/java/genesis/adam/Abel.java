package genesis.adam;

public class Abel extends Adam{


    public Abel(String name, boolean isDescription) {
        super(name, isDescription);
        setDescription("");
        if(isDescription){
            setDescription("Killed by his brother Cain");
        }
    }

    @Override
    public String toString() {
        return "\n\t"+getClass().getSimpleName()+ ": " + getDescription();
    }
}
