package question1;

public class Job extends Thread{

    static boolean raceOver = false;


    public static void sync(){
        int i =1;
        while (!raceOver && i <=5) {
            if(i == 5) {
                raceOver = true;
                System.out.println("Winner thread is "+Thread.currentThread().getName() + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Thread.currentThread().interrupt();
            }
            else{
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            i++;
        }
    }

    @Override
    public void run() {
        sync();
    }

}