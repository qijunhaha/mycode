package com.qijun.code.javacore.thread.demo3;

import java.util.Iterator;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月2日 下午8:37:52
 */
public class TestMain2 {
    
    // 调用Thread.interrupt()设置这个标记。当线程通过调用静态方法Thread.interrupted()检测中断时，中断状态会被清除。非静态的isInterrupted()方法被线程用来检测其他线程的中断状态，不改变中断状态标记。
    public static void main(String[] args) {

        final Thread t1 = new Thread() {

            @Override
            public void run() {
                System.out.println("t1 is run" + Thread.currentThread());
                for (;;) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println(Thread.currentThread() + " is interrupt this monment, the flag is "
                                           + Thread.currentThread().interrupted());
                    } else {
                        System.out.println(Thread.currentThread() + " flag is " + Thread.currentThread().interrupted());
                    }
                }
            }
        };

        Thread t2 = new Thread() {

            @Override
            public void run() {
                System.out.println("t2 is run" + Thread.currentThread());
                t1.interrupt();
                System.out.println("t2 is die");
            }
        };

        t1.setName("qj001");
        t2.setName("qj002");
        t1.start();
        t2.start();

    }

}
