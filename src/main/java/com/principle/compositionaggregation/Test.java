package com.principle.compositionaggregation;

/**
 *
 */
public class Test {
    /**
     *合成复用原则
     * @param args
     */
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
