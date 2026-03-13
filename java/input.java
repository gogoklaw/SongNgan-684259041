
import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pls Enter Number: ");
        int number = sc.nextInt();

        System.err.println("Your Number Is: "+number);

        sc.close();

        hello greet = new hello();
        greet.greeting();
        greet.greetingJapan();
        greet.greetingthailand();

    }
}