/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.factory.abstractfactory<br/>
 * <b>文件名：</b>Car.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月2日-上午8:56:57<br/>
 * 
 */
package com.glinin.java.javadesignpattern.factory.abstractfactory;

/**
 * <b>类   名：</b>Car<br/>
 * <b>类描述：</b>抽象产品类（车）
 *                抽象产品角色：它一般是具体产品继承的父类或者实现的接口。
 *                在java中由接口或者抽象类来实现。<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月2日 上午8:56:57<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月2日 上午8:56:57<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public interface Car {

    /**
     * drive(车具有驾驶的功能)
     *  
     * @exception 
     * @since 1.0
     * @author ningli
     */
    public void drive();
}
