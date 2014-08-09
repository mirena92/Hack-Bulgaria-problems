import java.util.concurrent.atomic.AtomicInteger;


public class RaceCondition {

    public static int counter=0;
    public static AtomicInteger count = new AtomicInteger(0);
    public final static Object monitor = new Object();
    
    public static void main(String[] args) {
        Thread t1 = new Thread (new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<2_000_000; i++) {
//                    synchronized(RaceCondition.monitor) {
//                        counter++;
//                    }
                    increment2();
                }
            }            
        });
        
        Thread t2 = new Thread (new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<2_000_000; i++) {
//                    synchronized(RaceCondition.monitor) {
//                        counter++;
//                    }
                    increment2();
                }
            }            
        });
        
        long startTime = System.currentTimeMillis();
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(count + "\n  Time: " + (endTime-startTime));
    }
    
    public static synchronized void increment() {
        counter++;
    }
    
    public static void increment2() {
        count.incrementAndGet();
    }
}
