public class WaitNotify {

    public final static Object monitor = new Object();
    private static int turn = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    synchronized (monitor) {

                        while (turn != 0) {
                            try {
                                monitor.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("Thread 1");
                        turn = (turn + 1) % 2;
                        monitor.notify();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    synchronized (monitor) {

                        while (turn != 1) {
                            try {
                                monitor.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("Thread 2");
                        turn = (turn + 1) % 2;
                        monitor.notify();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
