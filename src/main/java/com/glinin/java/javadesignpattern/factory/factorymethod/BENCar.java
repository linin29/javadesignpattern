/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.factory.factorymethod<br/>
 * <b>文件名：</b>BENCar.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月2日-上午9:03:05<br/>
 * 
 */
package com.glinin.java.javadesignpattern.factory.factorymethod;

/**
 * <b>类   名：</b>BENCar<br/>
 * <b>类描述：</b>具体产品类（ben车）
 *                具体产品角色：工厂类所创建的对象就是此角色的实例。
 *                在java中由一个具体类实现<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月2日 上午9:03:05<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月2日 上午9:03:05<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class BENCar implements Car {

    @Override
    public void drive() {
        System.out.println("BEN");
    }
}
