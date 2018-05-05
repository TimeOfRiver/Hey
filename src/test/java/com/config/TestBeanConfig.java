package com.config;

import com.ApplicatonDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/5/5
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ApplicatonDemo.class)
public class TestBeanConfig {

    @Resource(name="oneJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;
    @Resource(name="twoJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;

    @Test
    public void testUpdate() throws Exception {
        jdbcTemplate2.update("insert into user_info(user_name,age,sex) VALUES (?,?,?)", "Neo", 24, 1);
    }
}
