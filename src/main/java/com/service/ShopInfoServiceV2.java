package com.service;

import com.domain.ShopInfo;
import com.mapper.ShopInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/5/6
 */
@Service("com.service.shopInfoServiceV2")
public class ShopInfoServiceV2 {
    @Autowired
    private ShopInfoMapper shopInfoMapper;

    public ShopInfo findShopInfo(Long id ){
        return shopInfoMapper.selectOne(id.intValue());
    }

    public List<ShopInfo> findAll(){
        return shopInfoMapper.selectAll();
    }

    public int add(ShopInfo shopInfo){
        return shopInfoMapper.add(shopInfo);
    }

    public int delete(Long id){
        return shopInfoMapper.delete(id.intValue());
    }

    public int update(ShopInfo shopInfo){
        return shopInfoMapper.update(shopInfo);
    }
}
