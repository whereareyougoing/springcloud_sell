package com.imooc.order.utils;

import com.imooc.order.vo.ResultVO;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 02:26
 * @描述
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }


}
