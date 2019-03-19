package com.spi;

import com.spi.api.Say;

import java.util.ServiceLoader;

/**
 * @Author: xinput
 * @Date: 2019-03-20 01:25
 */
public class Main {
    public static void main(String[] args) {
        // ServiceLoader是java.util提供的用于加载固定类路径下文件的一个加载器，
        // 正是它加载了对应接口声明的实现类。
        ServiceLoader<Say> printerLoader = ServiceLoader.load(Say.class);
        for (Say say : printerLoader) {
            say.say();
        }
    }
}
