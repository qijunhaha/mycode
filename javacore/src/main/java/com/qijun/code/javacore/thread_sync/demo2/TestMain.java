package com.qijun.code.javacore.thread_sync.demo2;

import com.qijun.code.javacore.thread_sync.demo2.Counter;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月6日 上午10:43:56
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        final Counter counter = new Counter();

        Thread t1 = new Thread() {

            @Override
            public void run() {
                counter.addOne();
            }
        };

        Thread t2 = new Thread() {

            @Override
            public void run() {
                counter.removeOne();
            }
        };
        
        t1.start();
        t2.start();
        Thread.sleep(100);
        System.out.println(counter.getC());
    }
}

class Counter {

    private int c = 0;

    public synchronized void addOne() {
        c++;
    }

    public synchronized void removeOne() {
        c--;
    }

    public synchronized int getC() {
        return this.c;
    }
}
