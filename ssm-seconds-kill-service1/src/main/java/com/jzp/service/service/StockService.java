package com.jzp.service.service;

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

    /**
     * 根据id修改库存信息
     * @param stock
     */
    public void updateStockById(Stock stock);

}
