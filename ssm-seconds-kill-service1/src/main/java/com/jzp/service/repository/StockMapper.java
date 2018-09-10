package com.jzp.service.repository;

import com.jzp.service.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author jizhe.pan
 * @date 2018/9/5
 */
public interface StockMapper extends JpaRepository<Stock, Integer> {

    @Modifying
    @Query("update Stock s set s.sale = s.sale + 1, s.version = s.version + 1 where s.version = ?1 and s.id = ?2")
    public Integer updateByOptimistic(Integer version, Integer id);

}
