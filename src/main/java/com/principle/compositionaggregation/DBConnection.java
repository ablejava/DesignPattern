package com.principle.compositionaggregation;

/**
 * 抽象连接类
 */
public abstract class DBConnection {
//    public String getConnection(){
//        return "MySQL数据库连接";
//    }
    public abstract String getConnection();
}
