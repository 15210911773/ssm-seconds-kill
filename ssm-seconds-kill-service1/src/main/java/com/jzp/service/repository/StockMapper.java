package com.jzp.service.repository;

import com.jzp.service.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jizhe.pan
 * @date 2018/9/5
 */
public interface StockMapper extends JpaRepository<Stock, Integer> {}
