package com.dao;

import com.domain.ShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/4/15
 */
@Repository
public class ShopInfoDaoImpl implements ShopInfoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(ShopInfo shopInfo) {
        return jdbcTemplate.update("insert into shop_info(shop_name,shop_description,shop_type) value(?,?,?);"
                , shopInfo.getShopName(), shopInfo.getShopDescription(), shopInfo.getShopType());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from shop_info where id = ?", id);
    }

    @Override
    public int update(ShopInfo shopInfo) {
        return jdbcTemplate.update("UPDATE shop_info set shop_name = ?, shop_description = ?, shop_type = ?",
                shopInfo.getShopName(), shopInfo.getShopDescription(), shopInfo.getShopType());
    }

    @Override
    public List<ShopInfo> selectAll() {
        return jdbcTemplate.query("select * from shop_info", new Object[]{}, new BeanPropertyRowMapper<ShopInfo>(ShopInfo.class));
    }

    @Override
    public ShopInfo selectOne(int id) {
        List<ShopInfo> shopInfos = jdbcTemplate.query("select * from shop_info where id = ?", new Object[]{id},
                new BeanPropertyRowMapper<ShopInfo>(ShopInfo.class));
        if (shopInfos != null && shopInfos.size() > 0) {
            return shopInfos.get(0);
        }
        return null;
    }
}
