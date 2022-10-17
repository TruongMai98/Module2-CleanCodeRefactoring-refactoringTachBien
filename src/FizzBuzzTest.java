import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number int type");
        int number = scanner.nextInt();
        System.out.println(FizzBuzz.fizzBuzz(number));
    }
}
