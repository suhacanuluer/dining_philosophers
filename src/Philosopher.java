class Philosopher implements Runnable {
    private final Object leftChopstick;
    private final Object rightChopstick;

    Philosopher(Object left, Object right) {
        this.leftChopstick = left;
        this.rightChopstick = right;
    }

    private void move(String action) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }

    @Override
    public void run() {
        try {
            while (true) {
                move("is thinking."); // thinking
                synchronized (leftChopstick) {
                    move("take the left chopstick.");
                    synchronized (rightChopstick) {
                        move("take the right chopstick. now eating"); // eating
                        move("left the right chopstick.");
                    }
                    move("left the left chopstick. now thinking");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}