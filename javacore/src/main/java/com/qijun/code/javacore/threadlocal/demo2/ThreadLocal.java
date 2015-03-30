package com.qijun.code.javacore.threadlocal.demo2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/** 
 * 
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年3月30日 下午11:24:38 
 * @param <T>
 */
public class ThreadLocal<T> {
    
    private Map <Thread, T> map = Collections.synchronizedMap(new HashMap<Thread, T>());
    
    protected T initialValue(){
        return null;
    }
    
    public T get(){
        Thread t = Thread.currentThread();
        T obj = map.get(t);
        if(obj == null && !map.containsKey(t)){
            obj = initialValue();
            map.put(t, obj);
        }
        return obj;
    }
    
    public void set(T value){
        map.put(Thread.currentThread(), value);
    }
    
    public void remove(){
        map.remove(Thread.currentThread());
    }

}
