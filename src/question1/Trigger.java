package question1;

public class Trigger {
    static void main(String[] args) throws InterruptedException {
        Job job1 = new Job();
        Job job2 = new Job();
        Job job3 = new Job();

        Thread.sleep(1000);
        job1.start();
        job2.start();
        job3.start();
    }
}
