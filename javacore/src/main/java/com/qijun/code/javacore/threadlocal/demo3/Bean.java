package com.qijun.code.javacore.threadlocal.demo3;

/** 
 * 
 * @author jun.qij E-mail: jun.qij@alibaba-inc.com
 * @version time：2015年3月31日 上午7:52:42 
 */
public class Bean {
    
    private String id = "0";
    private String name = "none";
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String showInfo(){
        return "Bean{id:" + id + ",name:" + name + "}";
    }
}
