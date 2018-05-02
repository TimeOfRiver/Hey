package com.controller;

import com.alibaba.fastjson.JSONObject;
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

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.PUT)
    public void update(@PathVariable Long id, @RequestBody JSONObject jsonObject) {
        ShopInfo shopInfo = shopInfoService.selectOne(id.intValue());
        if (shopInfo == null) {
            return;
        }
        shopInfo.setShopName(jsonObject.getString("shopName"));
        shopInfo.setShopDescription(jsonObject.getString("shopDesc"));
        shopInfo.setId(id.intValue());
        try {
            shopInfoService.update(shopInfo);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("update failed!");
        }
    }

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        if (id != null) {
            try {
                shopInfoService.delete(id.intValue());
            } catch(Exception e) {
                e.printStackTrace();
                throw new RuntimeException("delete failed!");
            }
        }
    }

}
