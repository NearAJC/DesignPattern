package com.itnear.pattern.creational.prototype.shallowclone;

import java.text.MessageFormat;

/**
 * 描述：邮件工具
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class MailUtil {

    /**
     * 发送邮件
     *
     * @param mail 邮件
     */
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学,邮件地址:{1},邮件内容:{2}，发送邮件成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(),
                mail.getContent()));
    }

    /**
     * 保存原始邮件
     *
     * @param mail 邮件
     */
    public static void saveOriginMail(Mail mail) {
        System.out.println("存储originMail记录，originMail:" + mail.getContent());
    }
}
