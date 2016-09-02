/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.factory.simpleFactory<br/>
 * <b>文件名：</b>ProductA.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月1日-下午4:13:26<br/>
 * 
 */
package com.glinin.java.javadesignpattern.factory.simplefactory;

/**
 * <b>类   名：</b>ProductA<br/>
 * <b>类描述：</b>产品A<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月1日 下午4:13:26<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月1日 下午4:13:26<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class ProductA implements Product{


    @Override
    public void method() {
        System.out.println("产品A");
    }

}
