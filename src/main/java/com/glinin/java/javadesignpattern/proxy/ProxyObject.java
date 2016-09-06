/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.proxy<br/>
 * <b>文件名：</b>ProxyObject.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月6日-上午9:07:20<br/>
 * 
 */
package com.glinin.java.javadesignpattern.proxy;

/**
 * <b>类   名：</b>ProxyObject<br/>
 * <b>类描述：</b>代理对象角色
 *                代理对象内部含有目标对象的引用，从而可以在任何时候操作目标对象；
 *                代理对象提供一个与目标对象相同的接口，以便可以在任何时候替代目标对象。
 *                代理对象通常在客户端调用传递给目标对象之前或之后，执行某个操作，
 *                而不是单纯地将调用传递给目标对象<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月6日 上午9:07:20<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月6日 上午9:07:20<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class ProxyObject implements AbstractObject {

    private RealObject realObject;

    public ProxyObject() {
        super();
        this.realObject = new RealObject();
    }

    @Override
    public void operation() {
        before();
        realObject.operation();
        after();
    }

    private void after() {
        System.out.println("after proxy!");
    }

    private void before() {
        System.out.println("before proxy!");
    }
}
