package com.controller;

import com.domain.ShopInfo;
import com.service.ShopInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value="/",method = RequestMethod.GET)
    public List<ShopInfo> findShopInfo(HttpServletRequest request) {
        return shopInfoService.selectAll();

    }

}
