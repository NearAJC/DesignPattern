package com.itnear.pattern.behavioral.memento;

import java.util.Stack;

/**
 * 描述：手记备忘录管理类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento() {
        return ARTICLE_MEMENTO_STACK.pop();
    }

    public void addMemento(ArticleMemento articleMemento) {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
