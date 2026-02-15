package question4;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private int balance = 2000;

    private final Lock lock = new ReentrantLock();

    void withdraw(int amount) throws InterruptedException {
        try{
            System.out.println(Thread.currentThread().getName()+" attempting to withdraw");
            if(lock.tryLock(1900, TimeUnit.MILLISECONDS)){
                if(balance>amount){
                    try{
                        System.out.println(Thread.currentThread().getName()+" proceeding to withdraw");
                        Thread.sleep(2000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()+" withdraw completed, balance: "+balance);
                    } catch (Exception ex) {

                    }finally{
                        lock.unlock();
                    }

                }
                else{
                    System.out.println("Insufficient balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName()+" failed to withdraw");
            }
        } catch (Exception e) {}
    }
}
