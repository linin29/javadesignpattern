/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.adapter<br/>
 * <b>文件名：</b>Target.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月7日-上午9:35:26<br/>
 * 
 */
package com.glinin.java.javadesignpattern.adapter;

/**
 * <b>类   名：</b>Target<br/>
 * <b>类描述：</b>目标接口
 *                目标(Target)角色：这就是所期待得到的接口。
 *                注意：由于这里讨论的是类适配器模式，因此目标不可以是类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月7日 上午9:35:26<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月7日 上午9:35:26<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public interface Target {

    /**
     * sampleOperation1(操作1)
     * 
     * @exception @since 1.0
     * @author ningli
     */
    public void sampleOperation1();

    /**
     * sampleOperation2(操作2)
     * 
     * @exception @since 1.0
     * @author ningli
     */
    public void sampleOperation2();
}
