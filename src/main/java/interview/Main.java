package interview;

import java.util.*;
import java.util.stream.Stream;

public class Main {

       static ArrayList<Integer> arrayList = new ArrayList();
       static HashMap<String, String> cities = new HashMap<>();
       static Map<String, String > mapCities = new HashMap<>();
       static HashSet<String> cars = new HashSet<>();


    public static void main(String[] args) {
        //new Main().my("Tomaszek");

        String[] number = new String[]{"a","b"};
        List numberss = List.of(number);
        System.out.println(numberss);

        String name = "Andrzej";
        String tempName = "";

        for (int i = name.length()-1; i>=0;i--){
           tempName= tempName.concat(String.valueOf(name.charAt(i)));
        }
        System.out.println("Original string is " + name);
        System.out.println("Reverted string is " + tempName);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <100; i++){
            numbers.add(new Random().nextInt(20_000));
        }
        int max = 0;
        //find max in an array
        for (int a: numbers ) {

            if (a > max){
                max = a;
            }
        }

        System.out.println(numbers);
        System.out.println("Max number is" + max);


       // printArraysFindMax();
      // reverse("Tomasz");
       // hashMapTest();
        //hashSetTest();
        //numberRead();

    }

    static Stream<String>showTowns(){
        return Stream.of("Krakow","Wroclaw","Dom");
    }



    static void numberRead(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }

    static void hashSetTest(){
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Toyota");

        System.out.println("Cars " + cars);
        System.out.println(cars.contains("Mazda"));
    }

    static void hashMapTest(){
        cities.put("Poland","Namyslow");
        cities.put("Ireland","Cork");
        cities.put("Germany","Berlin");
        cities.put("England","London");

        mapCities.put("Poland","Namyslow");
        mapCities.put("Ireland","Cork");
        mapCities.put("Germany","Berlin");
        mapCities.put("England","London");

        System.out.println(cities);

        System.out.println("Map " + mapCities);

        System.out.println("Keys");
        //System.out.println(cities.get("Poland"));
        for (String c: cities.keySet()) {
            System.out.println(c);
        }

        System.out.println("Values");
        for (String c: cities.values()) {
            System.out.println(c);
        }

        System.out.println("************keys and values***************");
        for (String c: cities.keySet() ) {
            System.out.println("Kay " + c+ " Value " + cities.get(c));
        }
    }

    public static void populateArrays(int numberOfElements){
        for(int index = 0; index < numberOfElements; index++ ) {
            arrayList.add(new Random().nextInt(20_000));
            System.out.print(arrayList.get(index)+"-");
        }
        System.out.println();
    }

    public static void printArraysFindMax(){
        populateArrays(200);
        System.out.println("Size " + arrayList.size());

        int max = 0;
        for (Integer integer : arrayList) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println("\nMax = " + max );
    }


    public static void reverse(String input){
        System.out.println("original String " + input);
        String temp = "";

        for (int index = input.length() -1; index >= 0 ; index-- ){

            temp = temp.concat(String.valueOf(input.charAt(index)));
        }
        System.out.println("Reverted "+ temp);
        
    }

    void my(String input){
        System.out.println("Original string is: " + input);

        String temp="";
        for (int i = input.length()-1; i >= 0; i--){
            temp = temp.concat(String.valueOf(input.charAt(i)));
        }
        System.out.println("Reverted string: " + temp);
    }
}
