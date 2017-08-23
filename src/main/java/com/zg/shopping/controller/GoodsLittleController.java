package com.zg.shopping.controller;

import com.zg.shopping.bean.GoodsLittleSort;
import com.zg.shopping.service.GoodsLittleSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/8/22.
 */
@Controller
public class GoodsLittleController {


    @Autowired
    private GoodsLittleSortService goodsLittleSortService;
    /**
     * 添加小的分类gsid
     */
    @RequestMapping("addgoodsLittleSort")
    public String addgoodsLittleSort(){
        GoodsLittleSort goodsLittleSort = new GoodsLittleSort();
        goodsLittleSort.setGlsCategory("kkk");
        goodsLittleSort.setGbsId(2);
        goodsLittleSortService.addGoodsLittleSort(goodsLittleSort);
        return "person/address";
    }



}
