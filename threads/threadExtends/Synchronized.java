package threads.threadExtends;
//synchronized ensures only one thread enters the method at a time.
//
//Without it, both threads might check the balance before it's reduced, causing wrong deductions.
//like:  synchronized  void withdraw(int amount) {}
class BankAccount {
    int balance = 1000;

    synchronized void withdraw(int amount) {//with synchronized only one thread can access the withdraw() method at a time.
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is trying to withdraw...");
            try { Thread.sleep(100); } catch (Exception e) {}
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Not enough balance.");
        }
    }
}

class User extends Thread {
    BankAccount account;

    User(BankAccount account) {
        this.account = account; // Assigning shared BankAccount object to User class's account
    }

    public void run() {
        account.withdraw(700);
    }
}

public class Synchronized {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        User u1 = new User(acc);
        User u2 = new User(acc);

        u1.setName("User-1");
        u2.setName("User-2");

        u1.start();
        u2.start();
    }
}
