/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.singleton<br/>
 * <b>文件名：</b>StandardSingleton.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月1日-上午9:20:02<br/>
 * 
 */
package com.glinin.java.javadesignpattern.singleton;

/**
 * <b>类   名：</b>StandardSingleton<br/>
 * <b>类描述：</b>一种比较标准的单例模式的写法
 *                一个类的静态属性只会在第一次加载类时初始化，
 *                这是JVM帮我们保证的，所以我们无需担心并发访问的问题。
 *                所以在初始化进行一半的时候，别的线程是无法使用的，
 *                因为JVM会帮我们强行同步这个过程。另外由于静态变量只初始化一次，
 *                所以singleton仍然是单例的<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月1日 上午9:20:02<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月1日 上午9:20:02<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class StandardSingleton {

    /** 私有化构造函数 */
    private StandardSingleton(){}
    
    /**
     * getInstance(一个公共方法返回实例)
     * 
     * @return 静态实例
     * @exception 
     * @since 1.0
     * @author ningli
     */
    public static StandardSingleton getInstance(){
        return SingletonInstance.singleton;
    }
    
    /**
     * <b>类   名：</b>SingletonInstance<br/>
     * <b>类描述：</b>静态类<br/>
     * <b>创建人：</b>ningli<br/>
     * <b>创建时间：</b>2016年9月1日 上午9:25:52<br/>
     * <b>修改人：</b>ningli<br/>
     * <b>修改时间：</b>2016年9月1日 上午9:25:52<br/>
     * <b>修改备注：</b><br/>
     *
     * @version 1.0<br/>
     * 
     */
    private static class SingletonInstance {
        private static StandardSingleton singleton = new StandardSingleton();
    }
}
