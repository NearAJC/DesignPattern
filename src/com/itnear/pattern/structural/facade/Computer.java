package com.itnear.pattern.structural.facade;

/**
 * 描述：电脑类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class Computer {

    private CPU cpu;

    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.disk = new Disk();
    }

    public void open() {
        cpu.open();
        disk.open();
    }

    public void close() {
        cpu.close();
        disk.close();
    }
}
