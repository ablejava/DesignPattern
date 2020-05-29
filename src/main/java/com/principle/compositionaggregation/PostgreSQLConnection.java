package com.principle.compositionaggregation;

/**
 * 具体连接
 * postgre
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
