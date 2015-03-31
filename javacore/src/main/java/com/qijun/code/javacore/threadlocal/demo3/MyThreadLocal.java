package com.qijun.code.javacore.threadlocal.demo3;

/**
 * ʹ����ThreadLocal����
 * 
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time��2015��3��30�� ����10:19:34
 */
public class MyThreadLocal {
    
    // ������һ��ThreadLocal��������������int��Integer����
    private ThreadLocal<Bean> tl = new ThreadLocal<Bean>() {

                                        @Override
                                        protected Bean initialValue() {
                                            return new Bean();
                                        }
                                    };

    @Override
    public String toString(){
        return "MyThreadLocal{tl:" + tl + "}";
    }
    
    public Bean getBean(){
        return tl.get();
    }
}
