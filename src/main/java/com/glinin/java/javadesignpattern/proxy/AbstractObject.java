/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.proxy<br/>
 * <b>文件名：</b>AbstractObject.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月6日-上午9:04:15<br/>
 * 
 */
package com.glinin.java.javadesignpattern.proxy;

/**
 * <b>类   名：</b>AbstractObject<br/>
 * <b>类描述：</b>抽象对象角色
 *                声明了目标对象和代理对象的共同接口，
 *                这样一来在任何可以使用目标对象的地方都可以使用代理对象<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月6日 上午9:04:15<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月6日 上午9:04:15<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public interface AbstractObject {
    
    /**
     * operation(操作方法)
     *  
     * @exception 
     * @since 4.0
     * @author ningli
     */
    public abstract void operation();
}
