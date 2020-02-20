package com.itnear.pattern.creational.singleton;

/**
 * 描述：ThreadLocal线程单例 - 确保一个线程中只有一个实例
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
            = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {

    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }

}
