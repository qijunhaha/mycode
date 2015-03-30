package com.qijun.code.javacore.threadlocal.demo1;

/** 
 * 
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time��2015��3��30�� ����10:29:13 
 */
public class TestThread extends Thread{
    private MyThreadLocal mtl = new MyThreadLocal();

    public TestThread(MyThreadLocal mtl){
        super();
        this.mtl = mtl;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " " + mtl.getNextNum());
        }
    }
}
