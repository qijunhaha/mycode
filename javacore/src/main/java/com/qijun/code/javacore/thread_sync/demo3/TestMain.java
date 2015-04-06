package com.qijun.code.javacore.thread_sync.demo3;

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

    public void addOne() {
        synchronized(this){
            c++;
        }
    }

    public void removeOne() {
        synchronized(this){
            c--;
        }
    }

    public int getC() {
        return this.c;
    }
}
