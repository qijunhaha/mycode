package com.qijun.code.javacore.thread.demo3;

/**
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年4月2日 下午8:37:52
 */
public class TestMain {

    public static void main(String[] args) {
        String[] strs = { "1", "2", "3", "4" };

        for (int i = 0; i < strs.length; i++) {
            try {
                Thread.sleep(2000);
                interrupted();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
                return;
            }

            System.out.println(strs[i]);
        }
    }
    
    private static void interrupted() throws InterruptedException{
        throw new InterruptedException();
    }
    
}
