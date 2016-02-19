package com.devilmole.common.util;

/**
 * Created by Administrator on 2016/2/19 0019.
 */
public class StringUtil {
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public static int countLength(String source){
        if(source==null||source.isEmpty()){
            return 0;
        }else{
            return source.trim().length();
        }
    }

    public static String getUpper(String source){
        if(source==null||source.isEmpty()){
            return "";
        }else{
            return source.toUpperCase();
        }
    }

    public static void main(String[] args) {
        System.out.println("asdfasfdasdf");
    }
}
