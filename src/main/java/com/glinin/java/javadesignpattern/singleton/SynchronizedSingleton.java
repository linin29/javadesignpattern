/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.singleton<br/>
 * <b>文件名：</b>SynchronizedSingleton.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月1日-上午9:04:17<br/>
 * 
 */
package com.glinin.java.javadesignpattern.singleton;

/**
 * <b>类   名：</b>SynchronizedSingleton<br/>
 * <b>类描述：</b>具有双重加锁特性的例模式<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月1日 上午9:04:17<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月1日 上午9:04:17<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class SynchronizedSingleton {

    /** 一个静态实例 */
    private volatile static SynchronizedSingleton singleton;
    /** 私有化构造函数 */
    private SynchronizedSingleton(){}
    
    /**
     * getInstance(一个公共方法返回一个静态实例(具有双重枷锁特性))
     * 
     * @return 静态实例
     * @exception 
     * @since 1.0
     * @author ningli
     */
    public static SynchronizedSingleton getInstance() {
        if (singleton == null) {
            synchronized (SynchronizedSingleton.class) {
                if (singleton == null) {
                    singleton = new SynchronizedSingleton();
                }
            }
        }
        return singleton;
    }
}
