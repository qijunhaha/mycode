package com.qijun.code.javacore.thread_sync.demo4;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月6日 下午1:02:01
 */
public class TestMain {

    public static void main(String[] args) {
        final Friend qj = new Friend("qj");
        final Friend yy = new Friend("yy");

        Thread t1 = new Thread() {

            @Override
            public void run() {
                qj.bow(yy);
            }
        };

        Thread t2 = new Thread() {

            @Override
            public void run() {
                yy.bow(qj);
            }
        };

        t1.start();
        t2.start();
        
    }
}

class Friend {
    private String name;

    
    public Friend(String name){
        super();
        this.name = name;
    }


    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    public synchronized void bow(Friend f){
        System.out.println(this.name + "给" + f.getName() + "鞠躬");
        f.bowBack(this);
    }
    
    public synchronized void bowBack(Friend f){
        System.out.println(this.name + "回敬" + f.getName());
    }
    
}
