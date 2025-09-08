class Downloader extends Thread {
    int a=8;
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

public class ThreadExample {
    public static void main(String[] args) {
          new Player().start();
      Downloader obj=  new Downloader();
        obj.start();

      
    }
}
