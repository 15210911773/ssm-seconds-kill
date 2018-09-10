package com.jzp.service;

import com.jzp.service.model.Stock;

/**
 * @author jizhe.pan
 * @date 2018/9/5
 */
public interface StockService {

    /**
     * 根据id获取库存
     * @param sid
     * @return
     */
    public Stock getStockById(int sid);

}
