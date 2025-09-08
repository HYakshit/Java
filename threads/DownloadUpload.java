package threads;

class DownloadTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Downloading in thread " + i);
            try {
                Thread.sleep(200); // pause for 200 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class UploadTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Uploading in thread " + i);
            try {
                Thread.sleep(500); // pause for 500 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DownloadUpload {
    public static void main(String[] args) {
        Thread downloadThread = new Thread(new DownloadTask());
        Thread uploadThread = new Thread(new UploadTask());

        downloadThread.start();
        uploadThread.start();
    }
}
