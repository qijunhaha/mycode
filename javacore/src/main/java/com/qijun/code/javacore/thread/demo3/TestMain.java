package com.qijun.code.javacore.thread.demo3;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月2日 下午8:37:52
 */
public class TestMain {

    public static void main(String[] args) {

        final Thread t1 = new Thread() {

            @Override
            public void run() {
                System.out.println("t1 is run" + Thread.currentThread());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
                System.out.println("t1 is die");
            }
        };
        
        Thread t2 = new Thread(){
            
            @Override
            public void run() {
                System.out.println("t2 is run" + Thread.currentThread());
                t1.interrupt();
                System.out.println("t2 is die");
            }
        };

        t1.start();
        t2.start();
        
    }

}
