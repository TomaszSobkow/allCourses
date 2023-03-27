package amigos.dataStructure;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] price = new int[5];
        System.out.println("Enter "+ price.length+ " numbers: ");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<price.length; i++){
            price[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(price));
        Arrays.stream(price).forEach(System.out::println);




    }
}