package api.java.lang;

/**
 * 
 * 项目名称 : api.java
 * 创建日期 : 2018年1月18日
 * 类  描  述 :java基本数据类型
 * 修改历史 : 
 *     1. [2018年1月18日]创建文件 by ziqiang.zhang
 */
public class DataType {
    
    public static void main(String[] args) {
        
        int i = 100;
        // 十进制－十六进制
        System.out.println(Integer.toHexString(i));
        // 十六进制-十进制
        System.out.println(Integer.parseInt("1D", 16));
        
    }

}
