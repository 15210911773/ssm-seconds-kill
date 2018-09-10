package com.jzp.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jzp.service.StockService;
import com.jzp.service.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author jizhe.pan
 * @date 2018/9/6
 */
@Service(timeout = 5000)
@Component
public class StockServiceImpl implements StockService {

    @Autowired
    @Qualifier(value = "dBStockService")
    private com.jzp.service.service.StockService stockService;

    @Override
    public Stock getStockById(int sid) {
        return stockService.getStockById(sid);
    }

}
