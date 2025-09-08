package  Threads.threadExtends;
class Share extends Thread {
    static String msg[] = {"My name is Rahul", "I am working in ABC Company."};

    Share(String threadname) {
        super(threadname);
    }

    public void run() {
        display(getName());
    }

    public void display(String threadN) {
        synchronized(this) {
            for (int k = 0; k < msg.length; k++) {
                System.out.println(msg[k]);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {}
            }
        }
    }
}

public class SynchroThreadExample {
    public static void main(String[] args) {
//        if we did below code , lock will be created for each object and code will not be synchronised
//        Share T1 = new Share("Thread 1");
//        Share T2 = new Share("Thread 2");
//to fix this pass Share class obj to thread
        Share obj = new Share("Shared");  // single object

        Thread T1 = new Thread(() -> obj.display("Thread 1"));
        Thread T2 = new Thread(() -> obj.display("Thread 2"));

        T1.start();
        T2.start();
    }
}
