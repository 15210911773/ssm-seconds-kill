package com.jzp;

import com.jzp.service.OrderService;
import com.jzp.service.StockService;
import com.jzp.service.model.Stock;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jizhe.pan
 * @date 2018/9/6
 */
public class ApiTests extends SsmSecondsKillApiApplicationTests {

    @Autowired
    private StockService stockService;

    @Test
    public void test() {
        Stock stock = stockService.getStockById(1);
        System.err.println(stock);
    }

    @Autowired
    private OrderService orderService;

    @Test
    public void test1() {
        int result = orderService.createWrongOrder(1);
        System.err.println(result);
    }

}
