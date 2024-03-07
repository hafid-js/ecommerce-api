package com.hafidtech.ecommerceapi.repository;

import com.hafidtech.ecommerceapi.entity.Order;
import com.hafidtech.ecommerceapi.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByUserIdAndOrderStatus(Long userId, OrderStatus orderStatus);
}
