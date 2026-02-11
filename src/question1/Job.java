package question1;

public class Job extends Thread{

    @Override
    public void run() {
        sync();
    }

    public static synchronized void sync(){
        String name = Thread.currentThread().getName();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Runner: "+name);
    }

}
