package com.itnear.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：课程目录类
 * 作者：NearJC
 * 时间：2020/02/18
 */
public class CourseCatalog extends CatalogComponent {

    private List<CatalogComponent> catalogComponents = new ArrayList<CatalogComponent>();

    private String name;

    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        catalogComponents.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        catalogComponents.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (CatalogComponent component : catalogComponents) {
            if (level != null) {
                for (int i = 0; i < level; i++) {
                    System.out.print(" ");
                }
            }
            component.print();
        }
    }
}
