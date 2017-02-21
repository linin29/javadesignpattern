/**
 * <b>项目名：</b>编程技巧<br/>
 * <b>包   名：</b>com.glinin.java.technique<br/>
 * <b>文件名：</b>Technique.java<br/>
 * <b>版本信息：</b>4.0<br/>
 * <b>日期：</b>2017年2月21日-下午3:25:15<br/>
 * 
 */
package com.glinin.java.technique;

import java.util.Collections;
import java.util.List;

/**
 * <b>类 名：</b>Technique<br/>
 * <b>类描述：</b>编程技巧<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2017年2月21日 下午3:25:15<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2017年2月21日 下午3:25:15<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 4.0<br/>
 * 
 */
public class Technique {

    private static List<String> getString() {
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        List<String> list = getString();
        for (String string : list) {
            System.out.println(string);
        }
    }
}
