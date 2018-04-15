package com.service;

import com.dao.ShopInfoDao;
import com.domain.ShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/4/15
 */
@Service("shopInfoService")
public class ShopInfoServiceImpl implements ShopInfoService {

    @Autowired
    private ShopInfoDao shopInfoDao;

    @Override
    public int add(ShopInfo shopInfo) {
        return shopInfoDao.add(shopInfo);
    }

    @Override
    public int delete(int id) {
        return shopInfoDao.delete(id);
    }

    @Override
    public int update(ShopInfo shopInfo) {
        return shopInfoDao.update(shopInfo);
    }

    @Override
    public List<ShopInfo> selectAll() {
        return shopInfoDao.selectAll();
    }

    @Override
    public ShopInfo selectOne(int id) {
        return shopInfoDao.selectOne(id);
    }
}
