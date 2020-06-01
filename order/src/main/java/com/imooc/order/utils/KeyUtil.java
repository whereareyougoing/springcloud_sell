package com.imooc.order.utils;

import java.util.Random;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 01:53
 * @描述
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式：时间+随机数
     */

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
