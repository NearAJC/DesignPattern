package com.itnear.principle.compositionaggregation;

/**
 * 描述：PostgreSQL数据库连接类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class PostgreSQLConnection extends DBConnection {

    @Override
    String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
