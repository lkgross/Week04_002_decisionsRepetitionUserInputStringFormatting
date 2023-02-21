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
        /*
         * Do an inline initialization of a Scanner object.
         */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many powers of two do you want? ");
        /*
         * When the user types keystrokes at the keyboard, those keystrokes are stored in an area of memory that is sometimes called the keyboard buffer.
         * Note nextInt will remove and return the first integer it finds in the keyboard buffer.
         */
        int numberOfPowersOfTwo = keyboard.nextInt();
        System.out.println(numberOfPowersOfTwo);
        tableOfPowersOfTwo(numberOfPowersOfTwo);
        // Note next returns the first String it finds
        // in the buffer. It removes the String from the buffer and returns it.
        // It ignores a newline character (\n).
        /*
         * Sometimes a string contains a sequence of words or other items of data separated by spaces or other characters.
         * In programming terms, such items as these are known as tokens.
         * Note next will remove and return the next string token it finds in the keyboard buffer. (This could be an integer treated as a string!)
         * Contrast this with nextLine, which does not use spaces to separate tokens. It reads strings including the spaces.
         */
        System.out.println("What is your name for real? ");
        String realName = keyboard.next();
        System.out.println(realName);
        System.out.println("What is your name? ");
        // Note nextLine returns the first String it finds
        // in the buffer. It removes the String from the buffer and returns it.
        // It does NOT ignore a newline character (\n).
        String name = keyboard.nextLine();
        System.out.println(name);
        // Use printf for formatted strings.
        // Use %s as a placeholder for a string.
        // Use %b as a placeholder for a boolean.
        System.out.printf("In this formatted string example, we get %b for 5>3.\n", 5>3);
        System.out.printf("3<5 is %b\n", false);
        System.out.printf("%s says that the value is %b\n", "Laura", true);
        // Note %d is a placeholder for an integer (!!)
        // Use %,d if you want commas in your integers.
        // Note %f is placeholder for a floating-point number.
        System.out.printf("The rectangle has length %d and width %d\n", 200000, 3000);
        System.out.printf("The rectangle has length %,d and width %,d\n", 200000, 3000);
        System.out.printf("The rectangle has length %f and width %f\n", 13.7821444472, 3.11);
        // We can use %.2f for a number with 2 decimal digits.
        System.out.printf("The rectangle has length %.2f and width %.2f\n", 13.7821444472, 3.11);
        System.out.printf("The rectangle has length %12.2f and width %12.2f\n", 13.7821444472, 3.11);
        System.out.println(logr(-3));
        System.out.println(logr(0));
        System.out.println(Math.sqrt(-2));

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
        /*
         * Make the program intentionally crash
         * (throw an exception) if the argument to the function is not allowed.
         */
        if (n <= 0){
            throw new IllegalArgumentException();
        }
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