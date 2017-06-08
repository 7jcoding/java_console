package com.fanhuan;

import comm.ConfigHelper;
/**
 * 程序执行入口
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Environment:" + ConfigHelper.getPropertiesByKey("env"));
        System.out.println("Hello World!");
    }
}
