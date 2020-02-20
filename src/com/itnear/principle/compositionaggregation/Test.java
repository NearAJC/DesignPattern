package com.itnear.principle.compositionaggregation;

public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MySQLConnection());
        productDao.addProduct();
    }
}
