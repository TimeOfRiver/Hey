package com.dao;

import com.domain.ShopInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.awt.*;
import java.util.Date;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/4/15
 */
@Repository
public class ShopInfoDaoImpl implements ShopInfoDao {

    @Resource(name="oneJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;
    @Resource(name="twoJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;
    //@Autowired
    //private JdbcTemplate jdbcTemplate;

    @Override
    public int add(ShopInfo shopInfo) {
        return jdbcTemplate1.update("insert into shop_info(shop_name,shop_description,shop_type) value(?,?,?);"
                , shopInfo.getShopName(), shopInfo.getShopDescription(), shopInfo.getShopType());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate1.update("delete from shop_info where id = ?", id);
    }

    @Override
    public int update(ShopInfo shopInfo) {
        return jdbcTemplate1.update("UPDATE shop_info set shop_name = ?, shop_description = ?, shop_type = ?,update_time = ? WHERE id = ?",
                shopInfo.getShopName(), shopInfo.getShopDescription(), shopInfo.getShopType(),new Date(),shopInfo.getId());
    }

    @Override
    public List<ShopInfo> selectAll() {
        return jdbcTemplate1.query("select * from shop_info", new Object[]{}, new BeanPropertyRowMapper<ShopInfo>(ShopInfo.class));
    }

    @Override
    public ShopInfo selectOne(int id) {
        List<ShopInfo> shopInfos = jdbcTemplate1.query("select * from shop_info where id = ?", new Object[]{id},
                new BeanPropertyRowMapper<ShopInfo>(ShopInfo.class));
        if (shopInfos != null && shopInfos.size() > 0) {
            return shopInfos.get(0);
        }
        return null;
    }
}
