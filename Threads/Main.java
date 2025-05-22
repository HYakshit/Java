package Threads;

class Downloader extends Thread {
    public void run() {
//        sleep(500);
        System.out.println("Downloading file...");
    }
}

class Player extends Thread {
    public void run() {
        System.out.println("Playing audio...");
    }
}

public class Main {
    public static void main(String[] args) {
        new Downloader().start();
        new Player().start();
    }
}
