/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.proxy<br/>
 * <b>文件名：</b>DynamicProxy.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月6日-上午9:12:48<br/>
 * 
 */
package com.glinin.java.javadesignpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <b>类   名：</b>DynamicProxy<br/>
 * <b>类描述：</b>动态代理类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月6日 上午9:12:48<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月6日 上午9:12:48<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class DynamicProxy implements InvocationHandler {

    private RealObject realObject;

    public DynamicProxy(RealObject realObject) {
        super();
        this.realObject = realObject;
    }

    public void before() {
        System.out.println("在方法前做一些事，比如打开事务");
    }

    public void after() {
        System.out.println("在方法返回前做一些事，比如提交事务");
    }

    @Override
    public Object invoke(Object object, Method method, Object[] objects) throws Throwable {
        // 假设我们切入toString方法
        if (method.getName().equals("toString")) {
            before();
        }
        
        Object object2 = method.invoke(object, objects);
        
        if (method.getName().equals("toString")) {
            after();
        }
        return object2;
    }
    
    public Object getProxy(){
        return Proxy.newProxyInstance(getClass().getClassLoader(), realObject.getClass().getInterfaces(), this);
    }
}
