package com.jzp.service.service.impl;

import com.jzp.service.model.Stock;
import com.jzp.service.model.StockOrder;
import com.jzp.service.repository.StockOrderMapper;
import com.jzp.service.service.DBOrderService;
import com.jzp.service.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author jizhe.pan
 * @date 2018/9/5
 */
@Transactional(rollbackFor = Exception.class)
@Service(value = "dBOrderService")
@Slf4j
public class OrderServiceImpl implements DBOrderService {

    @Resource(name = "dBStockService")
    private StockService stockService;
    @Autowired
    private StockOrderMapper orderMapper;

    @Override
    public int createWrongOrder(int sid) {
        //校验库存
        Stock stock = checkStock(sid);
        //扣库存
        saleStock(stock);
        //创建订单
        int id = createOrder(stock);
        return id;
    }

    private int createOrder(Stock stock) {
        log.info("创建订单");
        StockOrder order = new StockOrder();
        order.setSid(stock.getId());
        order.setName(stock.getName());
        order.setCreateTime(new Date());
        StockOrder result = orderMapper.save(order);
        return result.getId();
    }

    private void saleStock(Stock stock) {
        log.info("修改库存");
        stock.setSale(stock.getSale() + 1);
        stockService.updateStockById(stock);
    }

    private Stock checkStock(int sid) {
        log.info("检查库存");
        Stock stock = stockService.getStockById(sid);
        if (stock.getSale().equals(stock.getCount())) {
            throw new RuntimeException("库存不足");
        }

        return stock;
    }


}
