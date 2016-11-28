/**
 * <b>项目名：</b>注解相关<br/>
 * <b>包   名：</b>com.glinin.java.annotation<br/>
 * <b>文件名：</b>UserCase.java<br/>
 * <b>版本信息：</b>4.0<br/>
 * <b>日期：</b>2016年11月28日-上午10:21:16<br/>
 * 
 */
package com.glinin.java.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <b>类 名：</b>UserCase<br/>
 * <b>类描述：</b>定义一个注解<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年11月28日 上午10:21:16<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年11月28日 上午10:21:16<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 4.0<br/>
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UserCase {

    public int id();

    public String description() default "no description";
}
