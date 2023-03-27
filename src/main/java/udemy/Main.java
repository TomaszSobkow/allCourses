package udemy;

public class Main {

    public static void main(String[] args) {

new Main().switchStatement(3);
        System.out.println(months("JANUARY"))
        ;
    }

public void switchStatement(int number){
        switch (number){
            case 1-> System.out.println("Value is 1");
            case 2 ,3,5,6 -> {
                System.out.println("Value is 2 or 3 or 5 or 6");
                System.out.println("But actually was " + number);
            }
            default -> System.out.println("Not number at all");
        }
}
public static String months(String month){
       return switch (month){
            case "January","February","March" -> "1st";
            case "April","May","June" -> "2nd";
            default -> "Bad";
        };
    }


}

