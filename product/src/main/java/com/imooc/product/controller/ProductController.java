package com.imooc.product.controller;

import com.google.common.collect.Lists;
import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.service.CategoryService;
import com.imooc.product.service.ProductService;
import com.imooc.product.utils.ResultVOUtil;
import com.imooc.product.vo.ProductInfoVO;
import com.imooc.product.vo.ProductVO;
import com.imooc.product.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 16:09
 * @描述
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;


    /**
     * 1、查询所有在架的商品
     * 2、获取类目的type列表
     * 3、查询类目
     * 4、构造数据
     *
     */

    @GetMapping("/list")
    public ResultVO<ProductVO> list(){

        List<ProductInfo> productInfoList = productService.findUpAll();

        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());


        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        List<ProductVO> productVOList = Lists.newArrayList();
        for (ProductCategory productCategory : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = Lists.newArrayList();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.returnSuccess(productVOList);

    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));
    }


}
