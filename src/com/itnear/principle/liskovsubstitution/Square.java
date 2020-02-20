package com.itnear.principle.liskovsubstitution;

/**
 * 描述：正方形类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class Square implements Quadrilateral {

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }
}
