package com.qijun.code.javacore.thread.demo1;

/** 
 * 
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月2日 下午8:15:35 
 */
public class ThreadOne implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(Thread.currentThread() + "~01");
        }
    }
    
}
