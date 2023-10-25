package board_infinity.fundamentals_java_programmin;

import java.util.Scanner;

class Keyboard {
    protected int writeNumber() {
        System.out.print("Type a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        return number;
    }
}

public class FizzBuzz {

    public static void main(String[] args) {
        
        Keyboard keyboard = new Keyboard();
        int number = keyboard.writeNumber();

        for (int i = 1; i <= number; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
            System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}