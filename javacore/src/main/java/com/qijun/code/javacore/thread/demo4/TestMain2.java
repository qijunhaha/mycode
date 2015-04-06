package com.qijun.code.javacore.thread.demo4;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月6日 上午10:00:28
 */
public class TestMain2 {

    // 主线程挂了，子线程还能继续执行
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName() + " thread is run");
        
        Thread t = new Thread(){
          @Override
          public void run(){
              System.out.println(Thread.currentThread().getName() + " is run");
              try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
              System.out.println(Thread.currentThread().getName() + " is die");
          }
        };
        
        t.start();
        
        System.out.println(Thread.currentThread().getName() + " thread is die");
    }
}
