package question4;

public class User {
    public static void main(String[] args) {
        Bank obj = new Bank();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    obj.withdraw(150);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1= new Thread(task,"Thread 1");
        Thread t2= new Thread(task,"Thread 2");
        t1.start();
        t2.start();
        }
    }
