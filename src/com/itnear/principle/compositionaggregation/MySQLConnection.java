package com.itnear.principle.compositionaggregation;

/**
 * 描述：mysql数据库连接类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class MySQLConnection extends DBConnection {

    @Override
    String getConnection() {
        return "MySQL数据库连接";
    }
}
