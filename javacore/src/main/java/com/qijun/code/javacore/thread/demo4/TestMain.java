package com.qijun.code.javacore.thread.demo4;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月6日 上午9:44:20
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        
        Thread t1 = new Thread(){
            @Override
            public void run(){
                for(;;){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread());
                }
            }
        };
        
        Thread t2 = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i< 100; i++){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread());
                }
            }
        };
        // t2 使用了join方法，所以join之后的代码需要等待t2线程执行完成后才能继续执行
        t2.start();
        t2.join();
        t1.start();
    }
}
