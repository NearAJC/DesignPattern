package com.itnear.principle.liskovsubstitution;

/**
 * 描述：长方形类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class Rectangle implements Quadrilateral {

    /**
     * 长度
     */
    private long length;

    /**
     * 宽度
     */
    private long width;

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }
}
