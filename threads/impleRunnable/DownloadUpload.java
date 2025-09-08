package threads.impleRunnable;
 class Download  implements Runnable {
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("inside Download");
        }
        try {
            Thread.sleep(200);
        }catch (Exception e){
            System.out.println("exception"+e);
        }
    }
}
 class Upload implements Runnable {
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("inside Upload");
        }
        try {
            Thread.sleep(400);
        }catch (Exception e){
            System.out.println("exception"+e);
        }
    }
}
public class DownloadUpload {
    public static void main(String[] args) {
        Download dobj=new Download();
                Upload oobj = new Upload();
        Thread ThreadD=new Thread(dobj);
        Thread ThreadO=new Thread(oobj);
       ThreadO.start();
        ThreadD.start();
    }
}
