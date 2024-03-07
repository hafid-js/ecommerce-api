package com.hafidtech.ecommerceapi.repository;

import com.hafidtech.ecommerceapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
