package com.example.demo.test.list;

/**
 * SynchronizedTest :
 *
 * @author : Trevor.yang
 * since: 2019/12/26 16:21
 */
public class SynchronizedTest2 implements Runnable {

    private static int count = 0;

    /**
     *  static synchronized 修饰一个count增加的方法 用于多个实例对象
     */
    private static synchronized void increase() {
        count ++;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest2 test1 = new SynchronizedTest2();
        SynchronizedTest2 test2 = new SynchronizedTest2();
        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
