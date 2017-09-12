package nag.com;

/**
 * Created by nagendra on 9/12/17.
 */
class MyThread extends Thread {

   /* public static void main(String[] args){

    }*/

    public void run(){
        for(int i=0; i<10;i++){
            System.out.println(i);
        }
    }
}



