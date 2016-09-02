/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.factory.simpleFactory<br/>
 * <b>文件名：</b>ProductFactory.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月1日-下午4:15:58<br/>
 * 
 */
package com.glinin.java.javadesignpattern.factory.simpleFactory;

/**
 * <b>类   名：</b>ProductFactory<br/>
 * <b>类描述：</b>工厂类<br/>
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
