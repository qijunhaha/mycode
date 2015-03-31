package com.qijun.code.javacore.threadlocal.demo3;

/** 
 * 
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年3月30日 下午10:32:55 
 */
public class TestMain {

    public static void main(String[] args) {
        MyThreadLocal mtl = new MyThreadLocal();
        Thread t1 = new TestThread(mtl);
        Thread t2 = new TestThread(mtl);
        t1.setName("qj001");
        t2.setName("qj002");
        t1.start();
        t2.start();
    }
}
