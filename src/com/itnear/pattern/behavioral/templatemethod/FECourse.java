package com.itnear.pattern.behavioral.templatemethod;

/**
 * 描述：前端课程类
 * 作者：NearJC
 * 时间：2020/02/20
 */
public class FECourse extends ACourse {

    private boolean needWriteArticle = false;

    public FECourse(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程前端代码");
        System.out.println("提供课程图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticle;
    }
}
