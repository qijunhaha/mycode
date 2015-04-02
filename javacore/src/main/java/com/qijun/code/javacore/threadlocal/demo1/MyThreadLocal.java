package com.qijun.code.javacore.threadlocal.demo1;

/**
 * ʹ����ThreadLocal����
 * 
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time��2015��3��30�� ����10:19:34
 */
public class MyThreadLocal {
    
//    private Integer tl = 0;
//    
//    public Integer getNextNum(){
//        return tl += 1;
//    }

    // ������һ��ThreadLocal��������������int��Integer����
    private static final ThreadLocal<Integer> tl = new ThreadLocal<Integer>() {

                                        @Override
                                        protected Integer initialValue() {
                                            return 0;
                                        }
                                    };

    public Integer getNextNum() {
        // ��tl��ֵ��ȡ���1������������t1��ֵ
        tl.set(tl.get() + 1);
        return tl.get();
    }
}
