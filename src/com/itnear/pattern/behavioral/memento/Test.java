package com.itnear.pattern.behavioral.memento;

public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("Java设计模式A", "手机内容A", "1.png");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题：" + article.getTitle() + "，内容：" + article.getContent() + "，暂存成功");
        System.out.println("手记完整信息：" + article);

        System.out.println("修改手记start");
        article.setTitle("Java设计模式B");
        article.setContent("手机内容B");
        article.setImgs("2.png");
        System.out.println("修改手记end");
        System.out.println("手记完整信息：" + article);
        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("Java设计模式C");
        article.setContent("手机内容C");
        article.setImgs("3.png");

        System.out.println("暂停回退start");
        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println("暂停回退end");
        System.out.println("手记完整信息：" + article);
    }
}
