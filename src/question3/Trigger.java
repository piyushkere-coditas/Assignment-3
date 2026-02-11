package question3;

public class Trigger {
    static void main(String[] args) {
        Job task = new Job();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 3; i++) {
                task.deposit(100);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 3; i++) {
                task.withdraw(200);
            }
        });

        t1.start();
        t2.start();
    }
}
