package com.itnear.principle.compositionaggregation;

/**
 * 描述：产品操作类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class ProductDao {

    /**
     * 数据库连接
     */
    private DBConnection dbConnection;

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "添加产品");
    }

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}
