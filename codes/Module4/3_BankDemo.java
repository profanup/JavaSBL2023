/* Problem Statement : Assume that two brothers, Joe and John, share a
common bank account. They both can, independently, read the balance, make 
a deposit, and withdraw some money. Implement java application demonstrate how
the transaction in a bank can be carried out concurrently.

*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance;
    private Lock lock = new ReentrantLock();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited $" + amount);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew $" + amount);
            } else {
                System.out.println(Thread.currentThread().getName() + " tried to withdraw $" + amount + " but insufficient funds.");
            }
        } finally {
            lock.unlock();
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000.0);

        Thread joeThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedAccount.deposit(200.0);
                try {
                    Thread.sleep(100); // Simulate some processing time
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Joe");

        Thread johnThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedAccount.withdraw(150.0);
                try {
                    Thread.sleep(100); // Simulate some processing time
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "John");

        joeThread.start();
        johnThread.start();

        try {
            joeThread.join();
            johnThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final balance: $" + sharedAccount.getBalance());
    }
}

