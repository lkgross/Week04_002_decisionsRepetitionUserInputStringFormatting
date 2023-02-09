package bsu.comp152;

public class Week04 {

    public static void main(String[] args) {
        continuationMessage("n");
        continuationMessage("yes");
        System.out.println(logr(32));
    }

    public static void continuationMessage(String proceed) {
        if (proceed.equals("y")) {
            System.out.println("Hello world!");
        } else if (proceed.equals("n")) {
            System.out.println("Let's quit!");
        } else {
            System.out.println("ERROR!");
        }
    }

    public static int logr(int n) {
        int power = 1;
        int count = 0;
        while (power <= n / 2) {
            power = 2 * power;
            count++;
        }
        return count;
    }
}