package com.principle.compositionaggregation;

/**
 * 具体连接
 * mysql
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
