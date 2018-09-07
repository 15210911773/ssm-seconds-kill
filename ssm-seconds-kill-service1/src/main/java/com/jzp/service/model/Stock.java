package com.jzp.service.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jizhe.pan
 * @date 2018/9/5
 */
@Data
@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer count;
    private Integer sale;
    private Integer version;

}
