package com.jzp.service.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author jizhe.pan
 * @date 2018/9/5
 */
@Data
@Entity
@Table(name = "stock_order")
public class StockOrder {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer sid;
    private String name;
    @Column(name = "create_time")
    private Date createTime;

}
