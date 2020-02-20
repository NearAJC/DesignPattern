package com.itnear.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：创建员工工厂类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    public static Employee getEmployee(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建部门经理" + department);
            String reportContent = department + "部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
