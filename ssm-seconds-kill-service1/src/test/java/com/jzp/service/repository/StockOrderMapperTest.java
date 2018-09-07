package com.jzp.service.repository;

import com.jzp.service.ServiceApplicationTests;
import com.jzp.service.model.Stock;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author jizhe.pan
 * @date 2018/9/6
 */
public class StockOrderMapperTest extends ServiceApplicationTests {

    @Autowired
    private StockMapper stockMapper;

    @Test
    public void test() {
        Stock one = stockMapper.findOne(1);
        System.err.println(one);
    }

}