import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Type number: ");
        input = scanner.nextInt();

        FizzBuzz.listFizzBuzz(input);


    }


}
