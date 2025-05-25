package  Threads;
class Shared {
    int data;
    boolean ready = false;

    synchronized void produce(int value) {
        while (ready) {
            try { wait(); } catch (Exception e) {}
        }
        data = value;
        System.out.println("Produced: " + data);
        ready = true;
        notify();  // Notify consumer
    }

    synchronized void consume() {
        while (!ready) {
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

public class InterComm {
    public static void main(String[] args) {
        Shared s = new Shared();
        new Producer(s).start();
        new Consumer(s).start();
    }
}
