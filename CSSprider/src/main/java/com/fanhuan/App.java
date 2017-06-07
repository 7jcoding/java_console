package com.fanhuan;

import Lin.Utils.Config;
/**
 * 程序执行入口
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Environment:" + Config.getPropertiesByKey("env"));
        System.out.println("Hello World!");
    }
}
