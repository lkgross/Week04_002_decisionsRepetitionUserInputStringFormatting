package bsu.comp152;
import java.util.Scanner;
public class Week04 {

    public static void main(String[] args) {
        continuationMessage("n");
        continuationMessage("yes");
        System.out.println(logr(32));
        System.out.println(logr(5));


        // Here's a switch statement in Java.
        // Note the break statements are important.
        int day = 1;
        switch (day) {
            case 0:
                System.out.println("Sun");
                break;
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("ERROR!");
        }
        System.out.println("Laura".toLowerCase());
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many powers of two do you want? ");
        int numberOfPowersOfTwo = keyboard.nextInt();
        System.out.println(numberOfPowersOfTwo);
        tableOfPowersOfTwo(numberOfPowersOfTwo);
        System.out.println("What is your name? ");
        // Note nextLine returns the first String it finds
        // in the buffer. It removes the String from the buffer.
        // It does NOT ignore a newline character (\n).
        String name = keyboard.nextLine();
        System.out.println(name);
    }

    /**
     * continuationMessage-
     * prints "Hello World!" if the argument is "y",
     * otherwise f the argument is "n" prints "Let's quit!",
     * and otherwise prints "ERROR!"
     *
     * @param proceed
     */
    public static void continuationMessage(String proceed) {
        if (proceed.equals("y")) {
            System.out.println("Hello world!");
        } else if (proceed.equals("n")) {
            System.out.println("Let's quit!");
        } else {
            System.out.println("ERROR!");
        }

    }

    /**
     * logr-
     * Returns a integer approximation to the log base 2 of n
     *
     * @param n
     * @return
     */
    public static int logr(int n) {
        int power = 1;
        int count = 0;
        while (power <= n / 2) {
            power = 2 * power;
            count++;
        }
        return count;
    }

    public static void tableOfPowersOfTwo(int numPowers) {
        int n = numPowers - 1;
        int power = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " " + power);
            power = 2 * power;
        }
    }
}