package nag.com;

/**
 * Created by nagendra on 9/12/17.
 */
public class Test {
    public static void main(String[] args){
        MyThread t = new MyThread();
        System.out.println(t.getName());
//        t.start();
        /*for(int i=0; i<10;i++){
            System.out.println("a:"+i);
        }*/
        t.currentThread().setName("Nag");
        System.out.println(Thread.currentThread().getName());
        System.out.println(t.getName());

        /*
        * parameterized method run(int i) shuld be invoked like ther normal method.
        * */
//        OverLoadedMyThread ot= new OverLoadedMyThread();
//        ot.start();
//        ot.run(5);
//        ot.start();

        System.out.println(Thread.currentThread());
    }
}
