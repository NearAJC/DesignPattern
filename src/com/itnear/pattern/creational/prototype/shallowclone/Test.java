package com.itnear.pattern.creational.prototype.shallowclone;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail originMail = new Mail();
        originMail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) originMail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@qq.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMail(originMail);
    }
}
