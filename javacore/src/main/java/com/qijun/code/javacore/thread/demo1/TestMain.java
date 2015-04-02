package com.qijun.code.javacore.thread.demo1;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月2日 下午8:20:26
 */
public class TestMain {

    public static void main(String[] args) {
        (new Thread(new ThreadOne())).start();
        
        (new ThreadTwo()).start();
        
    }
}
