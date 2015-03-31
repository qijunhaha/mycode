package com.qijun.code.javacore.threadlocal.demo3;

/**
 * 使用了ThreadLocal的类
 * 
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年3月30日 下午10:19:34
 */
public class MyThreadLocal {
    
    // 定义了一个ThreadLocal变量，用来保存int或Integer数据
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
