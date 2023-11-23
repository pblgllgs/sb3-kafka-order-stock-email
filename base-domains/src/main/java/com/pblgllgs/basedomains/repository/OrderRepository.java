package com.pblgllgs.basedomains.repository;

import com.pblgllgs.basedomains.dto.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,String> {
}
