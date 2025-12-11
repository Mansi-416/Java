package dec11;

import java.util.*;

class bankAccount {
    int balance = 100;

    synchronized void withdraw(int amt) {
        System.out.println(Thread.currentThread().getName() + " checking balance");
        if (balance >= amt) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amt);
            balance = balance - amt;
            System.out.println("Balance left: " + balance);
        } else {
            System.out.println("Not enough balance");
        }
    }
}

class newthread extends Thread {
    bankAccount b;

    newthread(bankAccount b) {
        this.b = b;
    }

    public void run() {
        b.withdraw(100);
    }
}

public class Bank {
    public static void main(String[] args) {
        bankAccount b = new bankAccount();

        newthread t1 = new newthread(b);
        newthread t2 = new newthread(b);

        t1.setName("Mansi");
        t2.setName("Chhavi");

        t1.start();
        t2.start();
    }
}
