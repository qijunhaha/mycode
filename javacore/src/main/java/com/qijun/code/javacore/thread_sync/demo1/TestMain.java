package com.qijun.code.javacore.thread_sync.demo1;

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
        
        // 这里会产生线程干扰，执行结果会产生不同结果
        t1.start();
        t2.start();
        System.out.println(counter.getC());

    }
}

class Counter {

    private int c = 0;

    public void addOne() {
        c++;
    }

    public void removeOne() {
        c--;
    }

    public int getC() {
        return this.c;
    }
}
