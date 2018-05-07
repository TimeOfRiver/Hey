package com.mapper;

import com.domain.ShopInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/5/6
 */
public interface ShopInfoMapper {
    int add(ShopInfo shopInfo);

    int delete(@Param("id") int id);

    int update(ShopInfo shopInfo);

    List<ShopInfo> selectAll();

    ShopInfo selectOne(@Param("id") int id);


}
