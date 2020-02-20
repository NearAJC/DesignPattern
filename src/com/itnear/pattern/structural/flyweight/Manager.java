package com.itnear.pattern.structural.flyweight;

/**
 * 描述：部分经理类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class Manager implements Employee {

    /**
     * 该属性属于内部状态，也是共享状态，不会随着外部环境的变化而变化
     */
    private String title = "部门经理";

    /**
     * 该属性属于外部状态，随着外部环境的变化而变化
     */
    private String department;

    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
