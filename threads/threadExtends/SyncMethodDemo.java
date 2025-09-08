package Threads.threadExtends;

// Example of Synchronized Method
class Tablem {
    // synchronized method
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Thread 1
class MyThread1m extends Thread {
    Tablem t;
    MyThread1m(Tablem t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

// Thread 2
class MyThread2m extends Thread {
    Tablem t;
    MyThread2m(Tablem t) {
        this.t = t;
    }
    public void run() {
        t.printTable(10);
    }
}

// Main class
public class SyncMethodDemo {
    public static void main(String[] args) {
        Tablem obj = new Tablem();   // one shared object
        MyThread1m t1 = new MyThread1m(obj);
        MyThread2m t2 = new MyThread2m(obj);
        t1.start();
        t2.start();
    }
}
