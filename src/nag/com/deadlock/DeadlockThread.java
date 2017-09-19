package nag.com.deadlock;

/**
 * Created by nagendra on 9/18/17.
 */
public class DeadlockThread extends Thread {
    A a = new A();
    B b = new B();

    public void m1(){
        this.start();
        a.d1(b); // This line of code is executed by main Thread
    }

    public void run(){
        b.d2(a); // this line of code is executed by child thread.
    }
    public static void main(String[] args){
        DeadlockThread thread = new DeadlockThread();
        thread.m1();
    }
}

class A{
    public synchronized void d1(B b){
        System.out.println("Thread1 is calling method d1()");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        System.out.println("Thread1 is calling B's last() method");
        b.last();
    }
    public synchronized void last(){
        System.out.println("This is A's last() method.");
    }
}

class B{
    public synchronized void d2(A a){
        System.out.println("Thread2 is calling method d2()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){}
        System.out.println("Thread2 calling A's last() mehtod");
        a.last();
    }

    public synchronized void last(){
        System.out.println("B's last mehtod");
    }
}
