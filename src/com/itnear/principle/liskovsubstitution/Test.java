package com.itnear.principle.liskovsubstitution;

public class Test {

//    /**
//     * 正方形继承长方形的设计中已经违背了里氏替换的原则，所以使用四边形接口进行修改
//     *
//     * @param rectengle 长方形对象
//     */
//    public static void resize(Rectangle rectengle) {
//        while (rectengle.getWidth() <= rectengle.getLength()) {
//            rectengle.setWidth(rectengle.getWidth() + 1);
//            System.out.println("width:" + rectengle.getWidth() + " length:" + rectengle.getLength());
//        }
//        System.out.println("resize方法结束 width:" + rectengle.getWidth() + " length:" + rectengle.getLength());
//    }

    /**
     * 正方形与长方形实现了四边形接口，四边形接口没有设置宽度的方法，从而限制了正方形对象使用该方法，即不破坏里氏替换原则
     *
     * @param rectengle 长方形对象
     */
    public static void resize(Rectangle rectengle) {
        while (rectengle.getWidth() <= rectengle.getLength()) {
            rectengle.setWidth(rectengle.getWidth() + 1);
            System.out.println("width:" + rectengle.getWidth() + " length:" + rectengle.getLength());
        }
        System.out.println("resize方法结束 width:" + rectengle.getWidth() + " length:" + rectengle.getLength());
    }


    public static void main(String[] args) {
        // 违背里氏替换原则
        // Square square = new Square();
        // square.setLength(10);
        // resize(square);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }
}
