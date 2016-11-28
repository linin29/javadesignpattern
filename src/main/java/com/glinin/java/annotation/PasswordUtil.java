/**
 * <b>项目名：</b>注解相关<br/>
 * <b>包   名：</b>com.glinin.java.annotation<br/>
 * <b>文件名：</b>PasswordUtil.java<br/>
 * <b>版本信息：</b>4.0<br/>
 * <b>日期：</b>2016年11月28日-上午10:24:58<br/>
 * 
 */
package com.glinin.java.annotation;

/**
 * <b>类 名：</b>PasswordUtil<br/>
 * <b>类描述：</b>描述这个类的功能<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年11月28日 上午10:24:58<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年11月28日 上午10:24:58<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 4.0<br/>
 * 
 */
public class PasswordUtil {

    @UserCase(id = 45, description = "validate password")
    public boolean validatePassword(String password) {
        return false;
    }
}
