/**
 * <b>项目名：</b>java8一些新特性<br/>
 * <b>包   名：</b>com.glinin.java.java8<br/>
 * <b>文件名：</b>Defaulable.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月7日-上午10:21:53<br/>
 * 
 */
package com.glinin.java.java8;

/**
 * <b>类   名：</b>Defaulable<br/>
 * <b>类描述：</b>描述这个类的功能<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月7日 上午10:21:53<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月7日 上午10:21:53<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public interface Defaulable {

    default String notRequired() { 
        return "Default implementation"; 
    } 
}
