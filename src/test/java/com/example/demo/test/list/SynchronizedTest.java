package com.example.demo.test.list;

/**
 * SynchronizedTest :
 *
 * @author : Trevor.yang
 * since: 2019/12/26 16:21
 */
public class SynchronizedTest implements Runnable {

    private static int count = 0;

    /**
     * synchronized 修饰一个count增加的方法
     */
    public synchronized void increase() {
        count ++;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest test = new SynchronizedTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
