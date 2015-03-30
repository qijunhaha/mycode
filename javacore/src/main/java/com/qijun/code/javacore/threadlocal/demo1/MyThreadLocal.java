package com.qijun.code.javacore.threadlocal.demo1;

/**
 * 使用了ThreadLocal的类
 * 
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年3月30日 下午10:19:34
 */
public class MyThreadLocal {
    
//    private Integer tl = 0;
//    
//    public Integer getNextNum(){
//        return tl += 1;
//    }

    // 定义了一个ThreadLocal变量，用来保存int或Integer数据
    private ThreadLocal<Integer> tl = new ThreadLocal<Integer>() {

                                        @Override
                                        protected Integer initialValue() {
                                            return 0;
                                        }
                                    };

    public Integer getNextNum() {
        // 将tl的值获取后加1，并更新设置t1的值
        tl.set(tl.get() + 1);
        return tl.get();
    }
}
