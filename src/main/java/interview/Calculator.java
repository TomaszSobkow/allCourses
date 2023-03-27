package interview;

public class Calculator {

    public int add(String a, String b){
        if (a == null || b == null){
            throw new NumberFormatException("Arguments 'a' and 'b' can not be empty ");
        }
        return Math.addExact(Integer.parseInt(a), Integer.parseInt(b));
    }
}
