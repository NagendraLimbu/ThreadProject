package nag.com;

/**
 * Created by nagendra on 9/14/17.
 */
public class JoinAndSleepThread {
    public static void main(String[] args) throws InterruptedException {
        JoinClass thread = new JoinClass();
        thread.start();
        thread.join();
        for(int i=0; i<5; i++ ){
            System.out.println("main thread");
        }
    }
}

class JoinClass extends Thread{
    public void run(){
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("child thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
