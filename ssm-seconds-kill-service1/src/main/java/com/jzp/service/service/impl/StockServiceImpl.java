package com.jzp.service.service.impl;


import com.jzp.service.model.Stock;
import com.jzp.service.repository.StockMapper;
import com.jzp.service.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jizhe.pan
 * @date 2018/9/5
 */
@Service("dBStockService")
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;

    @Override
    public Stock getStockById(int sid) {
        return stockMapper.findOne(sid);
    }

    @Override
    public Integer updateByOptimistic(Integer version, Integer id) {
        return stockMapper.updateByOptimistic(version, id);
    }

}
