package com.qijun.code.javacore.thread.demo3;

import java.util.Iterator;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月2日 下午8:37:52
 */
public class TestMain2 {
    
    // t1 thread只有在被interrupt的时刻flag是true，然后马上就成了false，这个中断状态只是中断一个时刻的状态
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
