package com.qijun.code.javacore.thread.demo2;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月2日 下午8:37:52
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {
        String[] strs = {"1", "2", "3", "4"};
        
        for (int i = 0; i < strs.length; i++) {
            
            Thread.sleep(5000);
            
            System.out.println(strs[i]);
        }
    }
}
