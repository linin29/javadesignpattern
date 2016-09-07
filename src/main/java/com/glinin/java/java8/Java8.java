/**
 * <b>项目名：</b>java8一些新特性<br/>
 * <b>包   名：</b>com.glinin.java.java8<br/>
 * <b>文件名：</b>Java8.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月7日-上午10:07:25<br/>
 * 
 */
package com.glinin.java.java8;

import java.util.Arrays;

/**
 * <b>类   名：</b>Java8<br/>
 * <b>类描述：</b>java8类，一些新特性<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月7日 上午10:07:25<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月7日 上午10:07:25<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class Java8 {

    public static void main(String[] args) {
        Arrays.asList("a", "b", "c").forEach((String element) -> {
            System.out.println(element);
        });
    }
}
