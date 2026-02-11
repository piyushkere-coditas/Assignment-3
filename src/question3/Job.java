package question3;

//Problem: Write a program to simulate a bank account system where multiple threads
//can deposit and withdraw money. Ensure that the balance updates correctly when
//multiple transactions happen concurrently.
//Objective: Understand how to use the synchronized keyword to avoid race conditions
//and ensure thread safety.

public class Job {
    private static int balance = 2000;

    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Balance: "+balance);
    }

    public synchronized void withdraw(int amount){
        balance -= amount;
        System.out.println("Rem Bal: "+balance);
    }
}
