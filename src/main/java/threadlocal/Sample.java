package threadlocal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sample {

    static class MyThread implements Runnable {

        private ThreadLocal<List<Integer>> tl1 = ThreadLocal.withInitial(ArrayList::new);
        private ThreadLocal<List<String>> tl2 = ThreadLocal.withInitial(ArrayList::new);

        @Override
        public void run() {
            try {
                int count = 0;
                while (++count < 10) {
                    Thread.sleep(new Random().nextInt(500));
                    tl1.get().add(count);
                    tl2.get().add("str" + count);
                    System.out.println(Thread.currentThread().toString() + tl1.get());
                    System.out.println(Thread.currentThread().toString() + tl2.get());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable target;
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
    }
}
