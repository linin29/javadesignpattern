/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.singleton<br/>
 * <b>文件名：</b>LazySingleton.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月1日-上午8:39:28<br/>
 * 
 */
package com.glinin.java.javadesignpattern.singleton;

/**
 * <b>类 名：</b>LazySingleton<br/>
 * <b>类描述：</b>单例模式（懒汉模式）存在线程安全的问题
 *                线程A调用getInstance方法时，判断singleton是null的时候，
 *                线程A就进入了if准备创造实例，
 *                同时线程B在线程A还未创造出实例之前，
 *                又进行了singleton是否为null的判断，这时singleton依然为null，
 *                所以线程B也会进入if去创造实例<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月1日 上午8:39:28<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月1日 上午8:39:28<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class LazySingleton {

    /** 一个静态实例 */
    private static LazySingleton singleton;

    /** 私有化构造函数 */
    private LazySingleton() {}

    /**
     * getInstance(一个公共方法返回一个静态实例(不考虑并发访问的情况下))
     * 
     * @return 静态实例
     * @exception 
     * @since 1.0
     * @author ningli
     */
    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
