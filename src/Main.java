import java.util.Scanner;
public class Main {
    public static void main(String args[]) throws Exception {
        try {
            Scanner input = new Scanner(System.in);
            int number1;
            int number2;

            System.out.print("Input first integer: ");
            number1 = input.nextInt();

            System.out.print("Input second integer: ");
            number2 = input.nextInt();

            if (number1 == number2)
                System.out.printf("%d == %d\n", number1, number2);
            if (number1 != number2)
                System.out.printf("%d != %d\n", number1, number2);
            if (number1 < number2)
                System.out.printf("%d < %d\n", number1, number2);
            if (number1 > number2)
                System.out.printf("%d > %d\n", number1, number2);



        } catch (Exception e) {

            System.out.println("You did not enter a number");

        }

    }
}


