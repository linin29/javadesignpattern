/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.factory.simpleFactory<br/>
 * <b>文件名：</b>ProductFactory.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月1日-下午4:15:58<br/>
 * 
 */
package com.glinin.java.javadesignpattern.factory.simplefactory;

/**
 * <b>类   名：</b>ProductFactory<br/>
 * <b>类描述：</b>工厂类
 *                当每新增一个产品的时候，工厂类就要相应增加业务逻辑和判断逻辑
 *                违背了开闭原则（对扩展开放，对修改关闭）<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月1日 下午4:15:58<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月1日 下午4:15:58<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class ProductFactory {

    private ProductFactory() {}

    public static Product createProduct(String productName) {
        if (productName == null) {
            return null;
        }
        if (productName.equals("A")) {
            return new ProductA();
        }
        else if (productName.equals("B")) {
            return new ProductB();
        }
        else {
            return null;
        }
    }
}
