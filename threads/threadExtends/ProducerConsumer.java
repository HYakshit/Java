package Threads.threadExtends;
// we will pass data to Shared thread's produce which conume will read without data being overriden by another thread with help of synchronized methods
class Shared {
    int data;
    boolean ready = false;// to check if data is ready to consume

    synchronized void produce(int value) {
        while (ready) {// wait if data is already stored in data variable
            try { wait(); } catch (Exception e) {}
        }
        data = value;
        System.out.println("Produced: " + data);
        ready = true;
        notify();  // Notify consumer
    }

    synchronized void consume() {
        while (!ready) { // wait if there is no data in data variable
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Consumed: " + data);
        ready = false;
        notify();  // Notify producer
    }
}

class Producer extends Thread {
    Shared s;
    Producer(Shared s) { this.s = s; }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            s.produce(i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class Consumer extends Thread {
    Shared s;
    Consumer(Shared s) { this.s = s; }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            s.consume();
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Shared s = new Shared();
        new Producer(s).start();
        new Consumer(s).start();
    }
}
