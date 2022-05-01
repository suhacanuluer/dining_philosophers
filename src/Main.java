import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the philosophers number: ");
        int numberOfPhilosophers = scan.nextInt();

        Philosopher[] philosophers = new Philosopher[numberOfPhilosophers];
        Object[] chopsticks = new Object[numberOfPhilosophers];

        for (int i = 0; i < chopsticks.length; i++) {
            chopsticks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {

            Object leftChopstick = chopsticks[i];
            Object rightChopstick = chopsticks[(i + 1) % chopsticks.length];

            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(rightChopstick, leftChopstick); // The last philosopher picks up the right chopstick first
            } else {
                philosophers[i] = new Philosopher(leftChopstick, rightChopstick);
            }

            Thread t = new Thread(philosophers[i], "Philosopher " + (char)((i + 1)+64));
            t.start();
        }
    }
}
