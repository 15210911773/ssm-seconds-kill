package com.jzp.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jzp.service.OrderService;
import com.jzp.service.service.DBOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author jizhe.pan
 * @date 2018/9/5
 */
@Service(timeout = 5000)
@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    @Qualifier(value = "dBOrderService")
    private DBOrderService orderService;

    @Override
    public int createWrongOrder(int sid) throws Exception {
        return orderService.createWrongOrder(sid);
    }

}
