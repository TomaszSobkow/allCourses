package genesis;

import genesis.adam.Abel;
import genesis.adam.Adam;
import genesis.adam.Cain;
import genesis.adam.seth.Seth;
import genesis.adam.seth.enosh.Enoch;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Person> adamDescendants = new ArrayList<>();

    public static void main(String[] args) {

        populateAdamDescendant(false);
        System.out.println(adamDescendants);

    }

    public static void populateAdamDescendant(boolean isDescription){
        adamDescendants.add(new Adam("Adam",isDescription));
        adamDescendants.add(new Cain("Cain",isDescription));
        adamDescendants.add(new Abel("Abel",isDescription));
        adamDescendants.add(new Seth("Seth",isDescription));
        adamDescendants.add(new Enoch("Enoch",isDescription));
    }




}