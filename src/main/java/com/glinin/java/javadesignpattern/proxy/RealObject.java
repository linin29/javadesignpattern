/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.proxy<br/>
 * <b>文件名：</b>RealObject.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月6日-上午9:05:41<br/>
 * 
 */
package com.glinin.java.javadesignpattern.proxy;

/**
 * <b>类   名：</b>RealObject<br/>
 * <b>类描述：</b>目标对象角色
 *                定义了代理对象所代表的目标对象<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月6日 上午9:05:41<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月6日 上午9:05:41<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class RealObject implements AbstractObject{

    @Override
    public void operation() {
        System.out.println("具体的实现");
    }
}
