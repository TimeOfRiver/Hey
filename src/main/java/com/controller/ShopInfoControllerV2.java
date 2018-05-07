package com.controller;

import com.domain.ShopInfo;
import com.service.ShopInfoServiceV2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/5/6
 */
@RestController("ShopInfoControllerV2")
@RequestMapping("/data/shopinfo2")
@MapperScan("com.mapper")
public class ShopInfoControllerV2 {
    @Autowired
    private ShopInfoServiceV2 shopInfoServiceV2;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<ShopInfo> findAllShopinfo(){
        return shopInfoServiceV2.findAll();
    }

}
