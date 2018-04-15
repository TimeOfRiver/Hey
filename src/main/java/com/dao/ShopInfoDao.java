package com.dao;

import com.domain.ShopInfo;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/4/15
 */
public interface ShopInfoDao {

    int add(ShopInfo shopInfo);

    int delete(int id);

    int update(ShopInfo shopInfo);

    List<ShopInfo> selectAll();

    ShopInfo selectOne(int id);

}
