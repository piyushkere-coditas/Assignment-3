package question2;

public class Job extends Thread{
    static volatile int counter = 0;

    @Override
    public void run() {
        counter += 1;
    }

    public void read() throws InterruptedException {
        Thread.sleep(500);
        System.out.println(counter);
    }
}
