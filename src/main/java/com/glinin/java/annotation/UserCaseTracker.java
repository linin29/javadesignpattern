/**
 * <b>项目名：</b>注解相关<br/>
 * <b>包   名：</b>com.glinin.java.annotation<br/>
 * <b>文件名：</b>UserCaseTracker.java<br/>
 * <b>版本信息：</b>4.0<br/>
 * <b>日期：</b>2016年11月28日-上午10:26:47<br/>
 * 
 */
package com.glinin.java.annotation;

import java.lang.reflect.Method;
import java.util.List;

/**
 * <b>类 名：</b>UserCaseTracker<br/>
 * <b>类描述：</b>描述这个类的功能<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年11月28日 上午10:26:47<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年11月28日 上午10:26:47<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 4.0<br/>
 * 
 */
public class UserCaseTracker {

    public static void trackUserCases(List<Integer> userCases, Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            UserCase userCase = method.getAnnotation(UserCase.class);
            if (userCase != null) {
                System.out.println("found userCase:" + userCase.id() + " " + userCase.description());
            }
        }
    }

    public static void main(String[] args) {

    }
}
