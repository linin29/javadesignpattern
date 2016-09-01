/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.singleton<br/>
 * <b>文件名：</b>Singleton.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月1日-上午10:09:00<br/>
 * 
 */
package com.glinin.java.javadesignpattern.singleton;

/**
 * <b>类   名：</b>Singleton<br/>
 * <b>类描述：</b>单例模式（饱汉模式）
 *                无论这个类是否被使用，都会创建一个singleton对象。如果这个创建过程很耗时，
 *                并且这个类还并不一定会被使用，那么这个创建过程就是无用的<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月1日 上午10:09:00<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月1日 上午10:09:00<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class Singleton {

    /** 一个静态实例 */
    private static Singleton singleton = new Singleton();
    
    /**
     * getInstance(一个公共方法返回一个静态实例(不考虑并发访问的情况下))
     * 
     * @return 静态实例
     * @exception 
     * @since 1.0
     * @author ningli
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
