package com.itnear.pattern.behavioral.templatemethod;

/**
 * 描述：课程抽象类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public abstract class ACourse {

    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    // 钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
