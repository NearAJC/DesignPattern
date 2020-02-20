package com.itnear.pattern.creational.prototype.shallowclone;

/**
 * 描述：邮件对象
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class Mail implements Cloneable {

    private String name;

    private String emailAddress;

    private String content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }

    /**
     * 㳀克隆对象
     *
     * @return 对象
     * @throws CloneNotSupportedException 不支持克隆异常
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }
}
