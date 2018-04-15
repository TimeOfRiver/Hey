package com.controller;

import com.domain.ShopInfo;
import com.service.ShopInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/4/15
 */
@RestController
@RequestMapping("/data/shopinfo")
public class ShopInfoController {
    @Autowired
    private ShopInfoService shopInfoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ShopInfo> findShopInfo(HttpServletRequest request) {
        return shopInfoService.selectAll();

    }

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public ShopInfo findShopInfoById(@PathVariable int id, HttpServletRequest request) {

        ShopInfo shopInfo = shopInfoService.selectOne(id);
        if (shopInfo == null) {
            throw new RuntimeException("Not found shopInfo:" + id);
        }
        return shopInfo;
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public void add(@RequestBody ShopInfo shopInfo) {// 请求的格式必须是js格式，字段名必须一一对应
        shopInfoService.add(shopInfo);
    }

}
