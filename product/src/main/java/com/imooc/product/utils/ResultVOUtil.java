package com.imooc.product.utils;

import com.imooc.product.vo.ResultVO;

/**
 * @作者 宋艾衡
 * @日期 2020-03-11
 * @时间 01:25
 * @描述
 */
public class ResultVOUtil {

    public static <T> ResultVO returnSuccess(T data) {
        return new ResultVO(data);
    }

}
