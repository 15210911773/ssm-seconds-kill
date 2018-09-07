package com.jzp.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jzp.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jizhe.pan
 * @date 2018/9/5
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Reference
    private OrderService orderService;

    /**
     * 下订单, 去库存
     * @param sid
     * @return
     */
    @RequestMapping("/createWrongOrder/{sid}")
    public String createWrongOrder(@PathVariable int sid) {
        log.info("sid=[{}]", sid);

        try {
            return String.valueOf(orderService.createWrongOrder(sid));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return String.valueOf(0);
    }

}
