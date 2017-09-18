package nag.com.sync;

/**
 * Created by nagendra on 9/16/17.
 */
public class Display1 {
    public synchronized void displayNumber(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }
            System.out.println(i);
        }
    }

    public synchronized void displayChar(){
        for(int i=65; i<75; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }
            System.out.println((char)i);
        }
    }
}
