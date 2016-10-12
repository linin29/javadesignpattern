/**
 * <b>项目名：</b>工具类<br/>
 * <b>包   名：</b>com.glinin.java.utils<br/>
 * <b>文件名：</b>CommonUtil.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月12日-上午8:31:34<br/>
 * 
 */
package com.glinin.java.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <b>类   名：</b>CommonUtil<br/>
 * <b>类描述：</b>通用工具类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月12日 上午8:31:34<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月12日 上午8:31:34<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class CommonUtil {

    /**
     * isBlank(是否是空)
     * 
     * @param object 判断的对象
     * @return 是否为空
     * @exception 
     * @since 1.0
     * @author ningli
     */
    public static boolean isBlank(Object object) {
        if (object instanceof String) {
            int strLen;
            if ((CharSequence) object == null || (strLen = ((CharSequence) object).length()) == 0) {
                return true;
            }
            for (int i = 0; i < strLen; i++) {
                if (Character.isWhitespace(((CharSequence) object).charAt(i)) == false) {
                    return false;
                }
            }
            return true;
        }
        if (object instanceof List<?>) {
            if (object == null || ((List<?>) object).size() <= 0) {
                return true;
            }
            return false;
        }
        if (object instanceof Map<?, ?>) {
            if (object == null || ((Map<?, ?>) object).size() <= 0) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public static void main(String[] args) {
        List<String> dd = new ArrayList<String>();
        dd.add("aa");
        Map<String, String> map = new HashMap<String, String>();
        map.put("mai", "ddd");
        //System.out.println(isBlank(dd));
        System.out.println(isBlank(map));
    }
}
