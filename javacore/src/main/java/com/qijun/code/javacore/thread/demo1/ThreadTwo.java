package com.qijun.code.javacore.thread.demo1;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月2日 下午8:18:53
 */
public class ThreadTwo extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread() + "~02");
        }
    }
}
